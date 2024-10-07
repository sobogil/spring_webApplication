<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title> list Todos Page</title>
</head>
<body>
    <div class="container">
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>id</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Is Done</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>

                </c:forEach>
            </tbody>
        </table>
    </div>
    <SCRIPT src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></SCRIPT>
    <SCRIPT src="webjars\jquery\3.6.0\jquery.min.js"></SCRIPT>
</body>
</html>
<%--C:\Users\Bogil\.gradle\caches\modules-2\files-2.1\org.webjars\bootstrap\5.1.3\b35baad17ca0e57a9dcdb1245a290cc35ff6e7c8\bootstrap-5.1.3.jar!--%>
<%--\META-INF\resources\webjars\bootstrap\5.1.3\css\bootstrap.min.css--%>

<%--C:\Users\Bogil\.gradle\caches\modules-2\files-2.1\org.webjars\bootstrap\5.1.3\b35baad17ca0e57a9dcdb1245a290cc35ff6e7c8\bootstrap-5.1.3.jar!--%>
<%--\META-INF\resources\webjars\bootstrap\5.1.3\js\bootstrap.min.js--%>

<%--C:\Users\Bogil\.gradle\caches\modules-2\files-2.1\org.webjars\jquery\3.6.0\633447ad320c04c69fb621d08ba2268f50822eee\jquery-3.6.0.jar!--%>
<%--\META-INF\resources\webjars\jquery\3.6.0\jquery.min.js--%>

