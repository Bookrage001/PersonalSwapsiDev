<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-09-02
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Action Page</title>
</head>

<%
    //Activate the database search-validate once DBManager functions are completed
    // DBManager db = (DBManager) session.getAttribute("manager");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User user = db.findUser(username, password);
    if (user != null) {
        session.setAttribute("userLogin", user);
        response.sendRedirect("loginWelcome.jsp");
    } else {
        session.setAttribute("existErr", "User profile does not exist!");
        response.sendRedirect("login.jsp");
    }
%>