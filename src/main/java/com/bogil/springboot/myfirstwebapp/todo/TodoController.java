package com.bogil.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("bogil");
        model.addAttribute("todos",todos);
        return "listTodos";
    }

    @GetMapping("add-todo")
    public String showNewTodoPage(ModelMap model) {
        String username =(String)model.get("name");
        Todo todo = new Todo(0,username,"",
                LocalDate.now().plusYears(1),false);
        model.put("todo",todo);
        return "todo";
    }

    @PostMapping("add-todo")
    public String addNewTodoPage(ModelMap model, @Valid Todo todo, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "todo";
        }
        String username =(String)model.get("name");
        todoService.addTodo(username,todo.getDescription(),
                todo.getTargetDate(),false);
        return "redirect:list-todos";
    }

    @GetMapping("delete-todo")
    public String deleteTodo(@RequestParam long id) {
        todoService.deleteById(id);
        return "redirect:list-todos";
    }

    @GetMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam long id,ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo",todo);
        return "todo";
    }

    @PostMapping("update-todo")
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "todo";
        }
        String username =(String)model.get("name");
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }

}

