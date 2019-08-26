
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>


<link href="./maincss.css" rel="stylesheet" type="text/css"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign in</title>
</head>
<body align="center">
<div class="nav">
    <a class="logo" href="index.jsp">SWAPSI</a>
    <a href="register.jsp">Login/Register</a>
    <span>|</span>
    <a href="Showcase/showcase.jsp">Showcase</a>
    <span>|</span>
    <a href="#Posts">Posts</a>
    <span>|</span>
    <a href="#chat">Chat</a>
    <span>|</span>
    <a href="#User">User Profile</a>
</div>
<div style="margin-top:10%">

    <h1>Enter your details to login: <span class="error"><c:if test="${existErr!=null}"><span class="error"><c:out value="${existErr}"/></span></c:if></span></h1>
    <form method="post" action="loginAction.jsp">

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
    </form>

    <p>Don't have an account? <font color="blue"><a href="register.jsp">Register</a></font></p>
</div>
<%@include file="./WEB-INF/Modules/footer.jspf" %>
</body>



</html>