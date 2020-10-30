<%-- 
    Document   : ver
    Created on : Oct 29, 2020, 7:20:26 AM
    Author     : arodas
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="models.Proveedor"%>
<%@page import="modelsDao.ProveedorDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proveedores</title>
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
                        <a class="nav-link" href="ProductosController?accion=listar">Productos</a>
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
                                <a class="dropdown-item" href="ProveedorController?accion=listar">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Usuarios</a>
                                <a class="dropdown-item" href="ProveedorController?accion=listar">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Roles</a>
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
            <h1>Proveedores</h1>
            <br/>
            <a type="button" class="btn btn-primary" href="ProveedorController?accion=crear">Nuevo Proveedor</a>
            <hr/>
        </div>

        <div style="border: 1pt; text-align: center;" class="container-fluid">


            <table class="table table-striped table-dark " border="1">
                <thead>
                    <tr>
                        <th>ID Proveedor</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>EMAIL</th>
                        <th>DIRECCION</th>
                        <th>NIT</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>

                <%
                    ProveedorDao proveedores = new ProveedorDao();
                    List<Proveedor> list = proveedores.listar();
                    Iterator<Proveedor> iter = list.iterator();
                    Proveedor proveedor = null;
                    while (iter.hasNext()) {
                        proveedor = iter.next();
                %>

                <tbody>
                    <tr>
                        <td><%= proveedor.getProveedorID()%></td>
                        <td><%= proveedor.getNombre() %></td>
                        <td><%= proveedor.getApellido() %></td>
                        <td><%= proveedor.getEmail() %></td>
                        <td><%= proveedor.getDireccion() %></td>
                        <td><%= proveedor.getNit() %></td>
                        <td><%= proveedor.getEstado() %></td>
                        <td>
                            <a type="button" class="btn btn-info" href="ProveedorController?accion=editar&ProveedorID=<%= proveedor.getProveedorID()%>">Editar</a>
                            <a type="button" class="btn btn-danger" href="ProveedorController?accion=eliminar&ProveedorID=<%= proveedor.getProveedorID()%>">Eliminar</a>
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
