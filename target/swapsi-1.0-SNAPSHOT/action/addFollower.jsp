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
<%@include file="../WEB-INF/Modules/navbar.jspf"%>

    <%
        FollowerController followerController = new FollowerController(username);
        String followerUsername = request.getParameter("TheirUserName");
        followerController.addFollower(followerUsername);
    %>
<%--do some data validation here in the future--%>
    <center>
        <%=username%> is now following: <%=followerUsername%>
    </center>
<%@include file="../WEB-INF/Modules/footer.jspf" %>

</body>
</html>
