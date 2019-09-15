<%-- 
    Document   : welcome
    Created on : 19/08/2019, 1:32:53 PM
    Author     : Hayley
--%>

<%@page import="swapsi.model.User.User"%>
<%@page import="swapsi.model.User.*"%>
<%--<%@page import="swapsi.model.dao.SwapsiMongoDBConnector"%>--%>
<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="mainstyle.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Welcome Page</title>
    </head>
    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>

    <%
        //User input from register form is stored into database through connection

        int key = (new Random()).nextInt(999999);
        String id = "" + key;
        username = request.getParameter("username");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String DOB = request.getParameter("DOB");
        String location = request.getParameter("location");

        User user = new User(id, username, firstName, lastName, email, password, DOB, location);
        session.setAttribute("UserLogin", user);
//        UserController users = new UserController();
//        users.addUser(id, username, firstName, lastName, email, password, DOB, location);
    %>



        <div align="center">

            <h1>Hello, <%=firstName%> <%=lastName%>!</h1>
            <h2>You have successfully created an account!</h2>
            <h3>Welcome to Swapsi! </h3>        
            <h4>Your username is: <%=username%></h4>
            <h4>Your email is: <%=email%></h4>
            <p>Click <a href="index.jsp">here</a> to view your dashboard!</p>         

        </div>

        <p>Click <a href="logout.jsp">here</a> to logout.</p>
        <h6>Click <a href="delete.jsp">here</a> to delete your account.</h6>
        
        <%@include file="./WEB-INF/Modules/footer.jspf" %>        
    </body>

</html>