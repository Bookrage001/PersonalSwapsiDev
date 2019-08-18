<%-- 
    Document   : register
    Created on : 15/08/2019, 9:10:56 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link
            href="https://fonts.googleapis.com/css?family=Montserrat"
            rel="stylesheet"
        />
        <link rel="stylesheet" type="text/css" href="maincss.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
      <div class="nav">
          <a class="logo" href="index.jsp">SWAPSI</a>
          <a href="register.jsp" class="active">Login/Register</a>
          <span>|</span>
          <a href="Showcase/showcase.jsp">Showcase</a>
          <span>|</span>
          <a href="#Posts">Posts</a>
          <span>|</span>
          <a href="#chat">Chat</a>
          <span>|</span>
          <a href="#User">User Profile</a>
      </div>
        <h1>Hello World!</h1>
        <p class="centered">This is the rego page ?</p>
        <%@include file="WEB-INF/Modules/footer.jspf" %>
    </body>
</html>
