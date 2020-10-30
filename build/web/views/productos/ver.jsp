<%-- 
    Document   : ver
    Created on : Oct 30, 2020, 12:25:23 AM
    Author     : arodas
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="models.Producto"%>
<%@page import="modelsDao.ProductoDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Productos</title>
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
                    <li class="nav-item">
                        <a class="nav-link" href="ProductoController?accion=listar">Productos</a>
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
            <h1>Productos</h1>
            <br/>
            <a type="button" class="btn btn-primary" href="ProductoController?accion=crear">Nuevo Producto</a>
            <hr/>
        </div>

        <div style="border: 1pt; text-align: center;" class="container-fluid">


            <table class="table table-striped table-dark " border="1">
                <thead>
                    <tr>
                        <th>ID PRODUCTO</th>
                        <th>DESCRIPCION</th>
                        <th>MARCA ID</th>
                        <th>ACTIVO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>

                <%
                    ProductoDao productos = new ProductoDao();
                    List<Producto> list = productos.listar();
                    Iterator<Producto> iter = list.iterator();
                    Producto producto = null;
                    while (iter.hasNext()) {
                        producto = iter.next();
                %>

                <tbody>
                    <tr>
                        <td><%= producto.getProductoID()%></td>
                        <td><%= producto.getDescripcion()%></td>
                        <td><%= producto.getMarcaID()%></td>
                        <td><%= producto.getEstado() %></td>
                        <td>
                            <a type="button" class="btn btn-info" href="ProductoController?accion=editar&ProductoID=<%= producto.getProductoID() %>">Editar</a>
                            <a type="button" class="btn btn-danger" href="TiendaController?accion=eliminar&ProductoID=<%= producto.getProductoID() %>">Eliminar</a>
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