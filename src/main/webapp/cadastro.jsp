<%-- 
    Document   : index
    Created on : Dec 11, 2015, 9:59:25 AM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulário</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="add" method="post">
            <label>Nome</label>
            <input type="text" name="nome">
            
            <label>Email</label>
            <input type="text" name="email">
            
            <label>Senha</label>
            <input type="password" name="password">
            
            
            <label>Telefone</label>
            <input type="text" name="fone">
            
            <input type="submit" value="Enviar">
            
        </form>
        
    </body>
</html>
