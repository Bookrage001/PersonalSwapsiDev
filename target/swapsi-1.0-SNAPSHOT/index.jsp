<%-- Document : index Created on : 18/08/2019, 3:03:43 AM Author : caleb --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="mark_Stylesheet.css" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Home Page</title>
  </head>
  <body>
      <%@include file="./WEB-INF/Modules/navbar.jspf"%>
      <div class="w-nav-right">
          <%@include file="./WEB-INF/Modules/followers.jspf"%>
      </div>
          <div>
              <%@include file="./WEB-INF/Modules/posts.jspf" %>
          </div>
          <p class="centered">
        </p>
      <%@include file="./WEB-INF/Modules/footer.jspf" %>
  </body>
