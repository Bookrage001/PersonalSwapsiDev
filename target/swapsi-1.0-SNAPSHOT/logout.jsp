<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>

<!DOCTYPE html>
<html>
<head>
    <title>Post Page</title>
</head>
<body>
    <%@include file="./WEB-INF/Modules/navbar.jspf" %>
    <%
        session.setAttribute("UserLogin", null);
    %>
      <%@include file="./WEB-INF/Modules/footer.jspf" %>
</body>
</html>