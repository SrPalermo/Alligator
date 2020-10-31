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
import models.OrdenCompra;
import modelsDao.OrdenCompraDao;
/**
 *
 * @author arodas
 */
@WebServlet(name = "OrdenCompraController", urlPatterns = {"/OrdenCompraController"})
public class OrdenCompraController extends HttpServlet {

    String list = "views/ordenesCompras/ver.jsp";
    String add = "views/ordenesCompras/crear.jsp";
    String edit = "views/ordenesCompras/editar.jsp";
    OrdenCompra oc = new OrdenCompra();
    OrdenCompraDao ocd = new OrdenCompraDao();
    int Id;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OrdenCompraController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrdenCompraController at " + request.getContextPath() + "</h1>");
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
            
            int ProveedorID = Integer.parseInt(request.getParameter("xProveedorID"));          
            ocd.add(ProveedorID);    
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
