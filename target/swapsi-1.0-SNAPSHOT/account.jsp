<%-- 
    Document   : account
    Created on : 13/09/2019, 8:10:44 PM
    Author     : Hayley
--%>

<%@page import="swapsi.model.dao.SwapsiMongoDBConnector"%>
<%@page import="swapsi.model.User.UserController"%>
<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="mainstyle.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Account Details</title>
    </head>
    
    <%        
        String username = request.getParameter("username");
        
        UserController users = new UserController();
        users.deleteUser(username);  

    %>

    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        
        It's sad to see you go! Your account has been successfully deleted.
        
        <%@include file="./WEB-INF/Modules/footer.jspf" %>

    </body>
</html>
