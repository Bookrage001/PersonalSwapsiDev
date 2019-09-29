<%-- 
    Document   : post_delete
    Created on : 10/09/2019, 11:41:53 PM
    Author     : mcant
--%>

<%@page import="swapsi.model.Post.PostController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DELETE Page</title>
    </head>
    <body>
        <%
            String key = request.getParameter("postID");
            int POST_ID = Integer.parseInt(key);
            PostController posts = new PostController();
            posts.deletePost(POST_ID);
            response.sendRedirect("./index.jsp");
            %>
    </body>
</html> 