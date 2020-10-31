/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.UsuarioRol;
import modelsDao.RolDao;
import modelsDao.TiendaDao;
import modelsDao.UsuarioDao;
import modelsDao.UsuarioRolDao;

/**
 *
 * @author lgomez
 */
public class UsuarioRolController extends HttpServlet {
    String list = "views/asignacionroles/ver.jsp";
    String add = "views/asignacionroles/crear.jsp";
    String edit = "views/asignacionroles/editar.jsp";
    UsuarioRol us= new UsuarioRol();
    UsuarioRolDao dao = new UsuarioRolDao();
    UsuarioDao userDao = new UsuarioDao();
    RolDao rolDao = new RolDao();
    TiendaDao tiendaDao =new TiendaDao();
    int Id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioRolController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioRolController at " + request.getContextPath() + "</h1>");
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
            
            int UsuarioID = Integer.parseInt(request.getParameter("xUsuarioID"));
            int RoID = Integer.parseInt(request.getParameter("xRoID"));
            int TiendaD = Integer.parseInt(request.getParameter("xTiendaID"));
           // String MarcaID = request.getParameter("xMarcaID");
            us.setUsuarioID(UsuarioID);
            us.setRolID(RoID);      
            us.setTiendaID(TiendaD);      
            dao.add(us);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("ID",request.getParameter("ID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            int UsuarioID = Integer.parseInt(request.getParameter("xUsuarioID"));
            int RoID = Integer.parseInt(request.getParameter("xRoID"));
            int TiendaD = Integer.parseInt(request.getParameter("xTiendaID"));
           // String MarcaID = request.getParameter("xMarcaID");
            us.setID(Id);
            us.setUsuarioID(UsuarioID);
            us.setRolID(RoID);      
            us.setTiendaID(TiendaD);      
            dao.edit(us);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("ID"));
           // String MarcaID = request.getParameter("xMarcaID");
            us.setID(Id);
            dao.delete(Id);
            access=list;
        }
                
        RequestDispatcher vista = request.getRequestDispatcher(access);
        vista.forward(request, response);
      
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
