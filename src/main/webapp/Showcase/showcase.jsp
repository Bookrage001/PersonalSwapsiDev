<%-- Document : showcase Created on : 17/08/2019, 11:09:13 PM Author : miche
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <link
      href="https://fonts.googleapis.com/css?family=Montserrat"
      rel="stylesheet"
    />
    <link rel="stylesheet" type="text/css" href="../maincss.css" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Showcase Page</title>
  </head>
  <body>
      <div class="nav">
          <a class="logo" href="../index.jsp">SWAPSI</a>
          <a href="../register.jsp">Login/Register</a>
          <span>|</span>
          <a href="showcase.jsp" class="active">Showcase</a>
          <span>|</span>
          <a href="#Posts">Posts</a>
          <span>|</span>
          <a href="#chat">Chat</a>
          <span>|</span>
          <a href="#User">User Profile</a>
      </div>
      
    <div class="box1"></div>

    <div class="box1"></div>
    
    <div class="box1"></div>

    <%@include file="../WEB-INF/Modules/footer.jspf" %>
  </body>
</html>
