<%-- 
    Document   : account
    Created on : 13/09/2019, 8:10:44 PM
    Author     : Hayley
--%>
<%@page import="swapsi.model.User.*"%>
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
    
  

    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        
          <%        
        User user = (User)session.getAttribute("UserLogin");
        
        UserController users = new UserController();
        users.deleteUser(user.getUSERNAME());  

    %>
        <div align="center">
        <p>It's sad to see you go! Your account has been successfully deleted.<p>
        <p><a href="index.jsp">Return to the Main Page</a></p>
        </div>
        
        <%@include file="./WEB-INF/Modules/footer.jspf" %>

    </body>
</html>
