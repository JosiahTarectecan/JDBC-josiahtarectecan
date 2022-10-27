<%-- 
    Document   : users
    Created on : Oct 24, 2022, 2:15:38 PM
    Author     : JosiahGabrielTarecte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <style>
                     table, td{
                            border: 1px solid black;
                     }
                     
              </style>
              <title>MVC Web Application</title>
       </head>
       <body>
              <h1>Manage Users</h1>
              <h2>${errorMessage}</h2>
              
              <table>
                     <th> 
                     <td>Email</td>
                     <td>First Name</td>
                     <td>Last Name</td>
                     <td>Role</td>
                     <td>&nbsp;&nbsp;&nbsp;</td>
                     <td> &nbsp;&nbsp;&nbsp;</td>
                     </th>  
              </table>
       </body>
</html>
