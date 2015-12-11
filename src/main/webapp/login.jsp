<%-- 
    Document   : login
    Created on : Dec 11, 2015, 10:29:53 AM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="login" method="post">
            
            <label>Login</label>
            <input type="text" name="login">
            
            <label>Senha</label>
            <input type="password" name="senha">
            
            <input type="submit" value="Enviar">
            
        </form>
        
    </body>
</html>
