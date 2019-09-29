<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-09-23
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="./WEB-INF/Modules/vairablesNimports.jspf"%>

<link href="mainstyle.css" rel="stylesheet" type="text/css"/>
<html>
<head>
    <title>Project Management</title>
</head>
<body>

<%@include file="./WEB-INF/Modules/navbar.jspf"%>



<h1>Project Management Feature</h1>




<h2>Add a Project</h2>

<div class="form">
    <form action="/action_page.php">
        Enter Name of Project<br>
        <input type="text" name="project_name" value="">
        <br>
        Enter Project Description<br>
        <input type="text" name="project_description" value="">
        <br><br>
        <input type="submit" value="Add Project">
    </form>

</div>



<h2>View Project</h2>

<form action="/action_page.php">
    <select name="cars">
        <option value="volvo">Compelete this user story</option>
        <option value="saab">Work on changing feature</option>
        <option value="mercedes">Edit Project</option>
        <option value="audi">Delete Feature</option>
    </select>
    <input type="submit" value="View Project">
</form>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Tag</th>
    </tr>
    <tr>
        <td>1</td>
        <td>Build a website</td>
        <td>I need a user interface</td>
        <td>Completed</td>
    </tr>
    <tr>
</table>


<h2>Edit Project</h2>




<h2>Remove Project</h2>

<form action="/action_page.php">
    <select name="cars">
        <option value="volvo">Build a website</option>
        <option value="saab">Work on changing feature</option>
        <option value="mercedes">Edit Project</option>
        <option value="audi">Delete Feature</option>
    </select>
    <input type="submit" value="Remove Project">
</form>

<%@include file="./WEB-INF/Modules/footer.jspf" %>
</body>


</html>

