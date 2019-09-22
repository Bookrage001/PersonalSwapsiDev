<%-- 
    Document   : search
    Created on : 26/08/2019, 3:10:40 PM
    Author     : Hayley
--%>

<%@page import="swapsi.model.Search.SearchController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>

        <h1>Hello World!</h1>
        <%
            SearchController search = new SearchController();

            Document result = null;
            Iterator it = posts.retrievePost();
            while (it.hasNext()) {
                result = (Document) it.next();
        %>
    </body>
</html>
