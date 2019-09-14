<%-- Document : index Created on : 18/08/2019, 3:03:43 AM Author : caleb --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" type="text/css" href="mainstyle.css" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
    </head>
    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf"%>
        <center>
            <p class="centered">
                <form action="action/login.jsp">
                    <label>SetUsername</label>
                    <input type="text" name="username" placeholder="UserName">
                </form>
            </p>
        </center>
        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>
</html>