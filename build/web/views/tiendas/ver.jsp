<%-- 
    Document   : ver
    Created on : Oct 28, 2020, 9:36:13 PM
    Author     : arodas
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="models.Tienda"%>
<%@page import="modelsDao.TiendaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tiendas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body>
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

        <!-- Finaliza el navbar -->
        
        
        
        <br/>
        <div style="border: 1pt;" class="container-fluid">
            <h1>Tiendas</h1>
            <br/>
            <a type="button" class="btn btn-primary" href="TiendaController?accion=crear">Nueva Tienda</a>
            <hr/>
        </div>

        <div style="border: 1pt; text-align: center;" class="container-fluid">


            <table class="table table-striped table-dark " border="1">
                <thead>
                    <tr>
                        <th>ID TIENDA</th>
                        <th>NOMBRE</th>
                        <th>DIRECCION</th>
                        <th>PORCENTAJE</th>
                        <th>ACTIVA</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>

                <%
                    TiendaDao tiendas = new TiendaDao();
                    List<Tienda> list = tiendas.listar();
                    Iterator<Tienda> iter = list.iterator();
                    Tienda tienda = null;
                    while (iter.hasNext()) {
                        tienda = iter.next();
                %>

                <tbody>
                    <tr>
                        <td><%= tienda.getTiendaID() %></td>
                        <td><%= tienda.getNombre() %></td>
                        <td><%= tienda.getDireccion() %></td>
                        <td><%= tienda.getPorcentajeGanancia() %></td>
                        <td><%= tienda.getEstado() %></td>
                        <td>
                            <a type="button" class="btn btn-info" href="TiendaController?accion=editar&TiendaID=<%= tienda.getTiendaID() %>">Editar</a>
                            <a type="button" class="btn btn-danger" href="TiendaController?accion=eliminar&TiendaID=<%= tienda.getTiendaID() %>">Eliminar</a>
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
