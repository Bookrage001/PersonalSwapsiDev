<%-- 
    Document   : register
    Created on : 15/08/2019, 9:10:56 PM
    Author     : Hayley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    
    <body>    
        <div>
            <form action="index.jsp" method="POST">
                <h1>Registration</h1>
                <table align="center">
                    <tr>
                        <td>
                            Username: <input type="text" name="username">
                        </td>
                        <td>Email: <input type="text" name="email"> </td>
                    </tr>
                    <table align="center">
                        <tr>
                            <td>
                                Password: <input type="text" name="password">
                            </td>
                            <td>
                                Confirm password: <input type="text" name="ConfirmPassword">
                            </td>
                        </tr>
                    </table>

                </table>
                <table align="center">
                    <tr>
                        <td>First Name: <input type="text" name="Firstname"> Last Name: <input type="text" name="Lastname"> </td>

                    </tr>
                </table>
                <table align="center">
                    <tr>
                        <td>Location: <input type="text" name="Location"> </td>
                     </tr>
                </table>
                <br>
                <br>
                <tr>
                    <td></td><td><input type="submit" value="Register"</td>
                </tr> 
            </form>
            
        </div>


        <p>Already have a username/password?</p>
        <p> <font color=blue><a href="login.jsp">Return to login page</a></p>
    </body>
</html>
