<%--
  User: caleb ardern
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="swapsi.model.follower.*" %>

<html>
<head>
    <title>Added Follower</title>
</head>
<body>
    <%
        String myUsername = request.getParameter("myUserName");
        String followerUsername = request.getParameter("myUserName");

        FollowerController followers = new FollowerController();
        followers.addFollower(myUsername, followerUsername);
    %>
</body>
</html>
