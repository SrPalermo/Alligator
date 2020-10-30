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
import models.Marca;
import modelsDao.MarcaDao;

/**
 *
 * @author arodas
 */
@WebServlet(name = "MarcaController", urlPatterns = {"/MarcaController"})
public class MarcaController extends HttpServlet {

    String list = "views/marcas/ver.jsp";
    String add = "views/marcas/crear.jsp";
    String edit = "views/marcas/editar.jsp";
    Marca marca= new Marca();
    MarcaDao dao = new MarcaDao();
    int Id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MarcaController at " + request.getContextPath() + "</h1>");
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
            marca.setDescripcion(Descripcion);
            dao.add(marca);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("MarcaID",request.getParameter("MarcaID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            String Descripcion = request.getParameter("xDescripcion");
            marca.setMarcaID(Id);
            marca.setDescripcion(Descripcion);
            dao.edit(marca);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("MarcaID"));
            marca.setMarcaID(Id);
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
