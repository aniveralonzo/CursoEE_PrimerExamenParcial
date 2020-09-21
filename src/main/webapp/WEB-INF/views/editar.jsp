<%-- 
    Document   : editar
    Created on : 19/09/2020, 18:03:54
    Author     : 50232
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica No.1</title>
    </head>
    <body>
        <h1>Editar Cliente</h1>
        <span>${mensaje}</span>
        <form method="POST" action="cliente/editar" 
              modelAttribute="cliente">
            <label >Codigo Cliente </label>
            <input type="text" name="id" value="${cliente.id}">          
            <label >NIT </label>
            <input type="text" name="nit" value="${cliente.nit}">
            <label >Nombre </label>
            <input type="text" name="nombre" value="${cliente.nombre}">
            <label >Direccion </label>
            <input type="text" name="direccion" value="${cliente.direccion}">
           
            <input type="submit" name="Agregar" class="btn btn-success">
            <a href="/PRIMERparcial">Regresar</a>
        </form>
    </body>
</html>


