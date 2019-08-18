<%-- 
    Document   : register
    Created on : 15/08/2019, 9:10:56 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="maincss.css" rel="stylesheet" type="text/css">

<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="maincss.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Register</title>
    </head>

    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        <div>
            <form action="index.jsp" method="POST">
                <h1>Registration</h1>
                <table align="center">
                    <tr><td>Username:</td><td><input type="text" name="username"></td></tr>
                    <tr><td>Email:</td><td><input type="text" name="email"></td></tr>
                    <tr><td>Password:</td><td><input type="password" name="password"></td></tr>
                    <tr><td>First Name:</td><td><input type="text" name="firstname"></td></tr>
                    <tr><td>Last Name:</td><td><input type="text" name="lastname"></td></tr>
                    <tr><td>DOB:</td><td><input type="date" name="dob"></td></tr>
                    <tr><td>Location:</td><td><input type="text" name="location"></td></tr>
                    <tr><td></td>
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
