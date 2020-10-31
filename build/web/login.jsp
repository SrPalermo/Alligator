
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">


    </head>
    <body class="text-center">

        <!-- inicia el navbar -->

        <nav class="navbar navbar-dark bg-dark" >
            
            <a style="color:white" class="navbar-toggler"><span class="navbar-toggler-icon"></span> &nbsp; Alligator</a>
            <div class="dropdown">
                <a style="color:white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Sesion</a>
                <div class="dropdown-item text-center">
                    <a>User</a>
                    <a>ejemplo@gmail.com</a>
                    <div class="dropdown-divider"></div>
                    <a>Salir</a>
                </div>
            </div>
             
        </nav>

        <!-- finaliza el navbar -->

        <br/>
        <br/>
        <br/>
        <br/>
      
        <!-- Content here -->
        <form class="form-signin" widht="" heigth=""  action="UsuarioController" method="POST">
            <center>
                <div class="col-md-3">
                    <img class="mb-4" src="https://image.flaticon.com/icons/png/512/65/65685.png" alt="" width="150" height="150">
                    <br/>

                    <input type="email" name="txtemail" id="inputEmail" class="form-control"     placeholder="Usuario" required="" autofocus="">

                    <input type="password" name="txtpass" id="txtpass" class="form-control" placeholder="Contraseña" required="">
                    <br/>
                    <button class="btn btn-lg btn-primary btn-block" type="submit"  name="accion" value="Ingresar">Entrar</button>
                    <p class="mt-5 mb-3 text-muted">Alligator by Abner & Cesar Rodas Developers ©2020</p>

                </div>
            </center>
        </form>


        <!-- JS here -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    </body>
</html>
