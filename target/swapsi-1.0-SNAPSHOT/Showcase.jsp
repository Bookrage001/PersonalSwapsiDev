<%-- 
    Document   : Showcase
    Created on : 22/09/2019, 10:46:11 PM
    Author     : miche
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>

<!DOCTYPE html>
<html>
  <head>
    <link href="Showcase.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script src="Showcase.js"></script>
    <title>Showcase Page</title>
  </head>
  <body>
      <%@include file="./WEB-INF/Modules/navbar.jspf"%>
      <div class="wrapper">
        <div class="row">
            <div class="col-xs-3 first1">Project1</div>
            
            <div class="col-xs-3">Project2</div>
            
            <div class="col-xs-3 last1">Project3</div>
            
            <div class="col-xs-3">Project4</div>
            
            <div class="col-xs-3 first1">Project5</div>
            
            <div class="col-xs-3">Project6</div>
            
            <div class="col-xs-3 last1">Project7</div>
            
            <div class="col-xs-3">Project8</div>
            
            <div class="col-xs-3 first1">Project9</div>
        </div>
      </div>

      <div class="cont">
        <button class="btn" id="prev">Previous</button>
        <button class="btn" id="next">Next</button>
      </div>
      <%@include file="./WEB-INF/Modules/footer.jspf" %>
  </body>
</html>
