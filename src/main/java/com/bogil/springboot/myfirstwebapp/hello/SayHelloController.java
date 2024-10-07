package com.bogil.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

    //"say-hello"
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! everyone";
    }

    @GetMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }

    @GetMapping("/say-hellhtml")
    public String sayHelloHtml(){
        return "hello";
    }
}
