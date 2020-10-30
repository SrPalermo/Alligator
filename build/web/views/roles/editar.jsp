<%-- 
    Document   : editar
    Created on : Oct 28, 2020, 6:51:58 PM
    Author     : arodas
--%>

<%@page import="models.Rol"%>
<%@page import="modelsDao.RolDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Roles</title>
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

        <br/>

        <div>

        
                <div class="container">
                    
                    <%
                        RolDao dao = new RolDao();
                        int RolID = Integer.parseInt((String)request.getAttribute("RolID"));
                        Rol rol = (Rol)dao.list(RolID);
                    %>
                    
                    <h1>Editar Rol</h1>
                    <br/>
                    <form class="form-signin" widht="" heigth="" action="RolesController">
                        <h5>Descripcion</h5>
                        <input name="xId" type="hidden" value="<%= rol.getRolID()%>">
                        <input name="xDescripcion" type="text"  class="form-control" placeholder="Ingrese una Descripcion" required="" autofocus="" value="<%= rol.getDescripcion() %>"> <br/>
                       
                        <br/>
                        <br/>
                        <br/>
                        <button class="btn btn-lg btn-primary btn-block" name="accion" type="submit" value="actualizar" >Guardar</button>
                        <a type="button" class="btn btn-lg btn-danger btn-block" href="RolesController?accion=listar">Cancelar</a>
                    </form>
                </div>
            
        </div>
        
        <!-- JS here -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    </body>
</html>
