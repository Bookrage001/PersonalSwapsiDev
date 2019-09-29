<%-- 
    Document   : register
    Created on : 15/08/2019, 9:10:56 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="swapsi.controller.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "x" %>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>

<!DOCTYPE html>

<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="mark_Stylesheet.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Register</title>
    </head>
    
    <%
        
        String emailError = request.getParameter("emailError");
        String passwordError = request.getParameter("passwordError");
        String emptyError = request.getParameter("empty");
    %>

    <body>
        <%@include file="WEB-INF/Modules/navbar.jspf"%>
        <div>
            <form action="welcome.jsp" method="POST">
                <h1>Registration</h1>
                <table align="center">
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" required="true"></td>
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>Email:</td><td><input type="text" name="email" required="true"></td>
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" required="true"></td>
                        &emsp;<span class="error"><x:if test="${passError!=null}"><x:out value="${passError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>First Name:</td
                        ><td><input type="text" name="firstName" required="true"></td>
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastName" required="true"></td>
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>Date of Birth:</td>
                        <td><input type="date" name="DOB" required="true"></td> 
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td>Location:</td>
                        <td><input type="text" name="location" required="true"></td>
                        &emsp;<span class="error"><x:if test="${emailError!=null}"><x:out value="${emailError}"/></x:if></span>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Register"> 
                        </td>
                    </tr>
                </table>
            </form>
        </div>

        <p>Already have a username/password?</p>
        <p> <font color=blue><a href="login.jsp">Return to login page</a></p>
            <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>
</html>