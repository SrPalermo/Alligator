/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Usuario;
import modelsDao.UsuarioDao;

/**
 *
 * @author arodas
 */
public class UsuarioController extends HttpServlet {

    String list = "views/usuarios/ver.jsp";
    String add = "views/usuarios/crear.jsp";
    String edit = "views/usuarios/editar.jsp";
    Usuario u= new Usuario();
    UsuarioDao dao = new UsuarioDao();
    int Id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String access="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            access=list;
        }else if(action.equalsIgnoreCase("crear")){
            access=add;
        }else if(action.equalsIgnoreCase("guardar")){
            String Nombre = request.getParameter("xNombre");
            String Apellido = request.getParameter("xApellido");
            String Usuario = request.getParameter("xUsuario");
            String Contrasea = request.getParameter("xContrasea");
            String Email = request.getParameter("xEmail");
            u.setNombre(Nombre);
            u.setApellido(Apellido);
            u.setUsuario(Usuario);
            u.setContrasea(Contrasea);
            u.setEmail(Email);
            dao.add(u);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("UsuarioID",request.getParameter("UsuarioID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            String Nombre = request.getParameter("xNombre");
            String Apellido = request.getParameter("xApellido");
            String Usuario = request.getParameter("xUsuario");
            String Contrasea = request.getParameter("xContrasea");
            String Email = request.getParameter("xEmail");
            u.setUsuarioID(Id);
            u.setNombre(Nombre);
            u.setApellido(Apellido);
            u.setUsuario(Usuario);
            u.setContrasea(Contrasea);
            u.setEmail(Email);
            dao.edit(u);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("UsuarioID"));
            u.setUsuarioID(Id);
            dao.delete(Id);
            access=list;
        }
                
        RequestDispatcher vista = request.getRequestDispatcher(access);
        vista.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion= request.getParameter("accion");
        String usuario = request.getParameter("txtemail");
        String password = request.getParameter("txtpass");     
        if(accion.equals("Ingresar")){         
           u=dao.validar(usuario, password);
            System.out.println("EMAIL==========="+u.getEmail().toString());
           if(u.getEmail()==usuario){
               request.setAttribute("usuario", u);
               request.getRequestDispatcher("home.jsp").forward(request, response);
           }else{
              request.getRequestDispatcher("TiendaController").forward(request, response); 
           }
           
       }else{
           request.getRequestDispatcher("RolesController").forward(request, response); 
       }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
