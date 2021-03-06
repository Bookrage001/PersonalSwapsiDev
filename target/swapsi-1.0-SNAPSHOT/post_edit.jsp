<%-- 
    Document   : post_edit
    Created on : 10/09/2019, 8:16:24 PM
    Author     : mcant
--%>

<%@page import="org.bson.Document"%>
<%@page import="java.util.Iterator"%>
<%@page import="swapsi.model.Post.PostController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %> 
        <%
            String key = request.getParameter("postID");
            int POST_ID = Integer.parseInt(key);
            PostController posts = new PostController();
            //retrieves specific post
            Document result = null;
            Iterator it = posts.getPost(POST_ID);
            while (it.hasNext()) {
                result = (Document) it.next();
        %>
        <div class="post">
            <div class="post-image">
                <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAZlBMVEXp7vFxswDu8flnrwBtsQDs8PbC2rHv8fuBuzaZxWmRwlp5tx17tyPb59ifyHhrsQDX5NHI3bev0JLL3rynzH/o7u6105nj6+W+16qDuzuex3Guz42HvUPd6Ny816a61qGqzYeMv0zKBmH+AAACqklEQVR4nO3b6ZKiMBRAYUkI4NZxbWfsdd7/JUd0VEBoEVLFveP5frZdqZxmi9VkNAIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADM2kQRg3dEgD8/H9noWwWaRDt9RK36yPg/B2LPEophsbBWMnZuieG24dMPCQ+CouMX2P85mFOElPjeLO093xEPo/k/6OiXYhLXGeF/rv1PSWJj4fKpFZGGRaH+GGCilgYcChQnq+QmO2853rtP5SUei2bzNrbbRfdHisaShMl96fHo9283iigkKTXNc3dvxwovxCNy8u4B5ff8kvTCdxcYnpt92HkqQwrV15DW5/Nc61/gPxhS4pF8aNV+K2fu0pvtCsfLnwd9M39szWPkz+n8IsjnxdovjCtmdplt+P6hLFF7a802SnG25NovzCVk+L7Pw7t4nyC9s88bPrH+EmUX5hi1VbVjzK1UQFhXdX3qXAm0QNhXe+PVUCq4kqCvN/YTR+A74JrCQqKWxWE1hO1F5YG1hKVF7YEFhMVFboyj9pDCwk6io0ybJ4m/wh8JqoqtAsrV1fE38MvCRqKjwEHlY1l8Q7gXmiaxpqeHXTOgZeE+8GRn5vGoYSoGZa/wLPifcDo/hFVeElME9M2wQqKywEHhKTWYtAXYWlwMMnbQJVFVYCW1JU2C1QUWHHQD2FXQPVFHYO1FLY4+0oJYXmzd8r0V64opBCCodBYSteR6F7nc46mm5UFI5cj30IlaEkeb53E2UMFdJpWssA03KS3xGO9yE2Ba1kvue9PT4ifDTtLTqOZOdDF1VVXsDoK56J21HiFmH3zIS4ogMznyH3PW0k7l5L11GgzWvef0kMzN8WTTbjAF4+t+IuwjPXf09QTt4lCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABP5y/4PUA8Ak3/PgAAAABJRU5ErkJggg==" alt="">
            </div>
            <div class="post-body">
                <div class="post-body__header">
                    <h3><%= result.getString("USER_ID")%></h3>
                </div>
                <div class="post-body__content">
                    <form action="${pageContext.request.contextPath}/action/editPost.jsp" method="Post">
                        <input type="hidden" name="postIDEdit" value="<%= result.getInteger("POST_ID")%>">
                        <textarea class="form-control" rows="4" cols="50" name="postTextEdit"><%= result.getString("Text")%></textarea>
                        <button class="m-post-btn1">Post</button>
                    </form>
                </div>
            </div>
        </div>

        <% }%>
        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>
</html>