<%-- 
    Document   : index
    Created on : 19/09/2020, 17:19:57
    Author     : 50232
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <a href="cliente">Crear Proveedor</a>                
    <table border="1">
        <thead>
            <tr>
                <th>Cod_cliente</th>
                <th>NIT</th>
                <th>Nombre </th>
                <th>Direccion </th>
                <th>** update **</th>
                <th>status</th>
            </tr>
        </thead>
        <tbody>
         <c:forEach items="${clienteList}" var="cliente">
            <tr>
                <td>${cliente.id}</td>
                <td>${cliente.nit}</td>
                <td>${cliente.nombre}</td>
                <td>${cliente.direccion}</td>
                <td>
                    <a href="cliente/id/${cliente.id}">Editar</a>
                    <a href="cliente/eliminar/${cliente.id}">Eliminar</a>
                </td>
                <td></td>
            </tr>
        </c:forEach>    
        </tbody>
    </table>
    </body>
</html>




