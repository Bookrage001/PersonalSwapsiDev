<%-- 
    Document   : welcome
    Created on : 19/08/2019, 1:32:53 PM
    Author     : Hayley
--%>

<%@page import="swapsi.model.*"%>
<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mainstyle.css"/> 
        <title>Welcome Page</title>
    </head>

    <%
        String firstname = request.getParameter("firstname");
        String lastname  = request.getParameter("lastname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
    %>

    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        <div align="center">
        <h1>Hello, <%=firstname%> <%=lastname%></h1>
        <p>You username: <%=username%></p>
        <p>Your email: <%=email%></p>
        </div>
        
        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>

</html>