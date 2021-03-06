<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>
<!DOCTYPE html>


<link href="maincss.css" rel="stylesheet" type="text/css"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign in</title>
</head>
<body>
<%@include file="./WEB-INF/Modules/navbar.jspf"%>
<div align="center">

    <div style="margin-top:10%">

        <h1>Enter your details to login: <span class="error"><c:if test="${existErr!=null}"><span class="error"><c:out value="${existErr}"/></span></c:if></span></h1>
        <form method="post" action="./action/login.jsp">

            <tr>
                <td><label>Username</label></td>
                <td><input type="text" name="username" placeholder="Username" required></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="password" placeholder="Password" required></td>
            </tr>
            <tr>
                <td><input class="button" type="submit" value="Login" style="margin-top:20px"></td>
            </tr>
            <tr>
                <td><input class="button" type="submit" value="Logout" style="margin-top:20px"></td>
            </tr>
        </form>

        <p>Don't have an account? <font color="blue"><a href="register.jsp">Register</a></font></p>
    </div>
</div>
<%@include file="./WEB-INF/Modules/footer.jspf" %>
</body>
</html>