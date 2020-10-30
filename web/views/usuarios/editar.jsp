<%-- 
    Document   : editar
    Created on : Oct 3, 2020, 2:26:54 PM
    Author     : arodas
--%>

<%@page import="models.Usuario"%>
<%@page import="modelsDao.UsuarioDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
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
                        UsuarioDao dao = new UsuarioDao();
                        int UsuarioID = Integer.parseInt((String)request.getAttribute("UsuarioID"));
                        Usuario u = (Usuario)dao.list(UsuarioID);
                    %>
                    
                    <h1>Editar Usuario</h1>
                    <br/>
                    <form class="form-signin" widht="" heigth="" action="UsuarioController">
                        <h5>Nombres</h5>
                        <input name="xId" type="hidden" value="<%= u.getUsuarioID() %>">
                        <input name="xNombre" type="text"  class="form-control" placeholder="Ingrese un Nombre" required="" autofocus="" value="<%= u.getNombre() %>"> <br/>
                        <h5>Apellidos</h5>
                        <input name="xApellido" type="text" class="form-control" placeholder="Ingrese un Apellido" required="" autofocus="" value="<%= u.getApellido() %>"> <br/><hr/>
                        <h5>Nombre de Usuario</h5>
                        <input name="xUsuario" type="text"  class="form-control" placeholder="Ingrese un Nombre de Usuario" required="" autofocus="" value="<%= u.getUsuario() %>"> <br/>
                        <h5>Contraseña</h5>
                        <input name="xContrasea" type="password"  class="form-control" placeholder="Ingrese una Contraseña" required="" autofocus="" value="<%= u.getContrasea() %>"> <br/>

                        <h5>Email</h5>
                        <input name="xEmail" type="email" class="form-control" placeholder="Ingrese un Correo Electronico" required="" value="<%= u.getEmail() %>"> <br/>
                        <br/>
                        <br/>
                        <br/>
                        <button class="btn btn-lg btn-primary btn-block" name="accion" type="submit" value="actualizar" >Guardar</button>
                        <a type="button" class="btn btn-lg btn-danger btn-block" href="UsuarioController?accion¿listar">Cancelar</a>
                    </form>
                </div>
            
        </div>
        
        <!-- JS here -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    </body>
</html>
