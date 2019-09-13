<%-- 
    Document   : welcome
    Created on : 19/08/2019, 1:32:53 PM
    Author     : Hayley
--%>

<%@page import="swapsi.model.dao.SwapsiMongoDBConnector"%>
<%@page import="swapsi.model.User.UserController"%>
<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mainstyle.css"/> 
        <title>Welcome Page</title>
    </head>

    <%
        int key = (new Random()).nextInt(999999);
        String id = "" + key;
        String username = request.getParameter("username");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String DOB = request.getParameter("DOB");
        String location = request.getParameter("location");
        
        UserController users = new UserController();
        users.addUser(id, username, firstName, lastName, email, password, DOB, location);
        
        //new Logic
//        User user = new User(id, username, firstName, lastName, email, password, DOB, location);
//        session.setAttribute("user", user);

//        String adminemail = (String) session.getAttribute("adminemail");
//        String adminpass = (String) session.getAttribute("adminpassword");
//        MongoDBConnector connector = new MongoDBConnector(adminemail, adminpass);
//        if (connector != null) {
//            connector.add(user);
//        } else {
//            out.print("Cannot add user");
//        }

    %>

    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        <div align="center">
            <h1>Hello, <%=firstName%> <%=lastName%></h1>
            <p>You username: <%=username%></p>
            <p>Your email: <%=email%></p>
        </div>

        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>

</html>