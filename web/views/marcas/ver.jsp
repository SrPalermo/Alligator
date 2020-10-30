<%-- 
    Document   : ver
    Created on : Oct 30, 2020, 1:30:46 AM
    Author     : arodas
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="models.Marca"%>
<%@page import="modelsDao.MarcaDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marcas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    </head>
    <body>
       
        <!-- inicia el navbar -->
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Alligator</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="TiendaController?accion=listar">Tiendas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ClienteController?accion=listar">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ProveedorController?accion=listar">Proveedores</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="MarcaController?accion=listar">Marcas</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Configuración
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                &nbsp;&nbsp;&nbsp;&nbsp; Sesiones
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="UsuarioController?accion=listar">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Usuarios</a>
                                <a class="dropdown-item" href="RolesController?accion=listar">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Roles</a>
                                <a class="dropdown-item" href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Asignación de Usuarios</a>
                            </div>    
                        </div>
                    </li>
                </ul>
            </div>
        </nav>

        <!-- Finaliza el navbar -->
        
        <br/>
        <div style="border: 1pt;" class="container-fluid">
            <h1>Marcas</h1>
            <br/>
            <a type="button" class="btn btn-primary" href="MarcaController?accion=crear"> Nueva Marca</a>
            <hr/>
        </div>

        <div style="border: 1pt; text-align: center;" class="container-fluid">


            <table class="table table-striped table-dark " border="1">
                <thead>
                    <tr>
                        <th>ID MARCA</th>
                        <th>DESCRIPCION</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>

                <%
                    MarcaDao marcas = new MarcaDao();
                    List<Marca> list = marcas.listar();
                    Iterator<Marca> iter = list.iterator();
                    Marca marca = null;
                    while (iter.hasNext()) {
                        marca = iter.next();
                %>

                <tbody>
                    <tr>
                        <td><%= marca.getMarcaID()%></td>
                        <td><%= marca.getDescripcion() %></td>
                      
                        <td>
                            <a type="button" class="btn btn-info" href="MarcaController?accion=editar&MarcaID=<%= marca.getMarcaID()%>">Editar</a>
                            <a type="button" class="btn btn-danger" href="MarcaController?accion=eliminar&MarcaID=<%= marca.getMarcaID()%>">Eliminar</a>
                        </td>
                    </tr>
                </tbody>

                <%}%>

            </table>

        </div>

        <!-- JS here -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


    </body>
</html>
