<%-- 
    Document   : crear
    Created on : 19/09/2020, 18:03:48
    Author     : 50232
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Practica No.1</title>
    </head>
        <body>
        <h1>Crear Cliente</h1>
        <span>${mensaje}</span>
        <form method="POST" action="${pageContext.servletContext.contextPath}/cliente/crear" 
              modelAttribute="cliente">
            <label >Codigo Cliente </label>
            <input type="text" name="id">
            <label >NIT </label>
            <input type="text" name="nit">
            <label >Nombre </label>
            <input type="text" name="nombre">
            <label >Direccion </label>
            <input type="text" name="direccion">
           
            <input type="submit" name="Agregar" class="btn btn-success">
            <a href="/PRIMERparcial">Regresar</a>
        </form>
    </body>

</html>
