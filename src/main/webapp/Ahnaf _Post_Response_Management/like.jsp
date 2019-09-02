<%-- 
    Document   : Like
    Created on : Aug 18, 2019, 7:07:22 PM
    Author     : Ahnaf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="maincss.css" rel="stylesheet" type="text/css">

<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="../maincss.css" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" /> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts</title>        
    </head>
        
    <body>
        <div class="nav">
            <a class="logo" href="../index.html">SWAPSI</a>
            <a href="register.jsp">Login/Register</a> 
            <span>|</span>
            <a href="Showcase/showcase.jsp">Showcase</a>
            <span>|</span>
            <%-- previously added <a class="active" href="../post.jsp">Posts</a> --%> 
            <a href="Ahnaf _Post_Response_Management/like.jsp">Posts</a>
            <span>|</span>
            <a href="#chat">Chat</a>
            <span>|</span>
            <a href="#User">User Profile</a>
        </div>
    </body>

    <p>On this page is a sample post. Post feature to be completed by another team member</p>

    <h2>- SAMPLE POST -</h2>
       
    <h2>-   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -</h2>
        
    <body>
        <h3>Number of Likes: </h3>
     
        <%-- <a href="#" class="button">LIKE!</a> --%>
           <button name="LIKE!" value="CONFIRM">LIKE</button>
    </body>

        <h2>-   -   -   -   -   -   -   -  -  -   -   -   -   -   -  -   -   -   - -   -   -   -</h2>
                
    <div>
        <form action="welcome.jsp" method="POST">
                <h3>Number of Comments: </h3>
                <table align="left">
                    <tr><td>COMMENTS</td><td><input type="text" name="Comment"></td></tr>
                        <td>
                            <input type="submit" value="SUBMIT"> 
                        </td>
                    </tr>
                </table>
            </form>
    </div>
   
    </body>
    
    <%-- mdules to be added from from post.jsp
    <body>
        <%@include file="./WEB-INF/Modules/navbar.jspf" %>
        <%@include file="./WEB-INF/Modules/add_post.jspf" %>
        <%@include file="./WEB-INF/Modules/footer.jspf" %>
    </body>
    --%>
    
</html>