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
    <div class="divcontainer">
        <div class="content-wrap">
            
            <h1 id="h1showcase">Project Community Showcase</h1>
            
            <h2 id="h1row">Most Likes</h2>
    
            <div class="grid-container">
                <div>1</div>
                <div>2</div>
                <div>3</div>  
                <div>4</div>
            </div>

            <div class="box1" class="div1"></div>
            
            <h2 id="h1row">Highest Views</h2>
    
            <div class="grid-container">
                <div>1</div>
                <div>2</div>
                <div>3</div>  
                <div>4</div>
            </div>
    
            <div class="box1" class="div1"></div>
            
            <h2 id="h1row">New Projects</h2>
    
            <div class="grid-container">
                <div>1</div>
                <div>2</div>
                <div>3</div>  
                <div>4</div>
            </div>
    
            <div class="box1"></div>
            
        </div>

    <%@include file="../WEB-INF/Modules/footer.jspf" %>
    
    </div>
  </body>
</html>
