<%--
  Created by IntelliJ IDEA.
  User: caleb
  Date: 13/09/2019
  Time: 10:27 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
</head>
<body>
    <%@include file="../WEB-INF/Modules/navbar.jspf"%>
    <h1 align="center">Welcome</h1>
    <%
//        String username = request.getParameter("user_name");

//        String id = "" + key;
        username = request.getParameter("username");
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String DOB = request.getParameter("DOB");
//        String location = request.getParameter("location");

        user = new User();
        user.setUSERNAME(username);
        session.setAttribute("UserLogin", user);
    %>
    <p class="centered">
    <%=username%>
    </p>
    <%@include file="../WEB-INF/Modules/footer.jspf" %>
</body>
</html>
