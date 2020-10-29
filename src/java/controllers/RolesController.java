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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Rol;
import modelsDao.RolDao;
/**
 *
 * @author arodas
 */
@WebServlet(name = "RolesController", urlPatterns = {"/RolesController"})
public class RolesController extends HttpServlet {

    String list = "views/roles/ver.jsp";
    String add = "views/roles/crear.jsp";
    String edit = "views/roles/editar.jsp";
    Rol role= new Rol();
    RolDao dao = new RolDao();
    int Id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RolesController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RolesController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
            String Descripcion = request.getParameter("xDescripcion");
            role.setDescripcion(Descripcion);
            dao.add(role);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("RolID",request.getParameter("RolID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            String Descripcion = request.getParameter("xDescripcion");
            
            role.setRolID(Id);
            role.setDescripcion(Descripcion);
            dao.edit(role);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("RolID"));
            role.setRolID(Id);
            dao.delete(Id);
            access=list;
        }
                
        RequestDispatcher vista = request.getRequestDispatcher(access);
        vista.forward(request, response);
        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
