<%-- 
    Document   : ActionEdit_post
    Created on : 10/09/2019, 10:27:55 PM
    Author     : mcant
--%>

<%@page import="swapsi.model.Post.PostController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <%
    int postID = Integer.parseInt(request.getParameter("postIDEdit"));
    String postText = request.getParameter("postTextEdit");
    PostController posts = new PostController();
    posts.updatePost(postID, postText);
    
    response.sendRedirect("./post.jsp");
    
%>
</html>