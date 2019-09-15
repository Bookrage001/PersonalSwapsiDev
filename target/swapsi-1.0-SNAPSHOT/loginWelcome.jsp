<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-09-02
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<%
    User user = (User) session.getAttribute("userLogin");
    String username = user.getUsername();
    DBManager db = (DBManager) session.getAttribute("manager");
    int logId = (new Random()).nextInt(999999);
    String activity = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

    db.createLog(logId, username, "logged in", activity);
%>
<body>

<% if (user != null) {%>
<h1>Hello, <%= user.getFirstname()%></h1>
<p>Your username is: <%= user.getUsername()%></p>
<p>log: <%= activity %> </p>


<%
    session.setAttribute("user", user);
%>
<button class="button" type="button" onclick="location.href = 'index.jsp'" > Main Page </button>

<% } else { %>

<p class="outline"> Login unsuccessful! </p>
<button class="button" type="button" onclick="location.href = 'index.jsp'" > Main Page </button>

<% } %>

<button class="button" type="button" onclick="location.href = 'index.jsp'" > Home Page </button>
</body>
</html>