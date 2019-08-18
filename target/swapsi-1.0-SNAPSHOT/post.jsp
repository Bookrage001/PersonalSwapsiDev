<%-- Document : index Created on : 17/08/2019, 14:03:43 AM Author : Mark G. --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="main_Stylesheet.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Home Page</title>
    </head>
    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        <h1>Hello World!</h1>

        <p class="w-centered">
            Add Post Prototype
        </P>
        <textarea rows="5" cols="60">
            What is in your mind
        </textarea>
        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>
</html>
