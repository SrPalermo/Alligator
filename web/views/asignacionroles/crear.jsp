<%-- 
    Document   : crear
    Created on : Oct 30, 2020, 12:25:47 AM
    Author     : arodas
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="models.Usuario"%>
<%@page import="models.Rol"%>
<%@page import="models.Tienda"%>
<%@page import="modelsDao.TiendaDao"%>
<%@page import="modelsDao.UsuarioDao"%>
<%@page import="modelsDao.RolDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Asignacion Usuario</title>
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
                                <a class="dropdown-item" href="UsuarioRolController?accion=listar">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Asignación de Usuarios</a>
                            </div>    
                        </div>
                    </li>
                </ul>
            </div>
        </nav>

        <!-- Finaliza el navbar -->


        <br/>

        <div>


            <div class="container">
                <h1>Asignacion de Rol</h1>
                <br/>
                <form class="form-horizontal" widht="" heigth="" action="UsuarioRolController">

                    <div class="form-group">
                        <label class="control-label col-sm-2">Usuario</label>
                        <div class="col-sm-10">
                            <select name="xUsuarioID" class="form-control">

                                <%
                                    UsuarioDao marcas = new UsuarioDao();
                                    List<Usuario> list = marcas.listar();
                                    Iterator<Usuario> iter = list.iterator();
                                    Usuario marca = null;
                                    while (iter.hasNext()) {
                                        marca = iter.next();
                                %>

                                <option value="<%= marca.getUsuarioID()%>"><%= marca.getNombre()%> </option>

                                <%}%>

                            </select>
                        </div>
                                
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Rol</label>
                        <div class="col-sm-10">
                            <select name="xRoID" class="form-control">

                                <%
                                    RolDao roles = new RolDao();
                                    List<Rol> rollist = roles.listar();
                                    Iterator<Rol> roliter = rollist.iterator();
                                    Rol role = null;
                                    while (roliter.hasNext()) {
                                        role = roliter.next();
                                %>

                                <option value="<%= role.getRolID()%>"><%= role.getDescripcion()%> </option>

                                <%}%>

                            </select>
                        </div>
                                
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Tienda</label>
                        <div class="col-sm-10">
                            <select name="xTiendaID" class="form-control">

                                <%
                                    TiendaDao x = new TiendaDao();
                                    List<Tienda> tiendalist = x.listar();
                                    Iterator<Tienda> tiendaiter = tiendalist.iterator();
                                    Tienda tienda = null;
                                    while (tiendaiter.hasNext()) {
                                        tienda = tiendaiter.next();
                                %>

                                <option value="<%= tienda.getTiendaID() %>"><%= tienda.getNombre() %> </option>

                                <%}%>

                            </select>
                        </div>
                                
                    </div>

                    <div class="col-sm-4">
                        <table>
                            <tbody>
                                <tr>
                                    <td>
                                        <button class="btn btn-lg btn-primary btn-block" name="accion" type="submit" value="guardar" >Guardar</button> 
                                    </td>
                                    <td>
                                        <a type="button" class="btn btn-lg btn-danger btn-block" href="UsuarioRolController?accion=listar">Cancelar</a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>

                    </div>

                </form>
            </div>

        </div>

        <!-- JS here -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


    </body>
</html>
