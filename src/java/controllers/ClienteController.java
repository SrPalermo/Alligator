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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Cliente;
import modelsDao.ClienteDao;
/**
 *
 * @author arodas
 */
@WebServlet(name = "ClienteController", urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {
String list = "views/clientes/ver.jsp";
    String add = "views/clientes/crear.jsp";
    String edit = "views/clientes/editar.jsp";
    Cliente cliente= new Cliente();
    ClienteDao dao = new ClienteDao();
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
            out.println("<title>Servlet ClienteController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteController at " + request.getContextPath() + "</h1>");
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
            String Nombre = request.getParameter("xNombre");
            String Apellido = request.getParameter("xApellido");
            String Email = request.getParameter("xEmail");
            String Direccion = request.getParameter("xDireccion");
            String Nit = request.getParameter("xNit");
            cliente.setNombre(Nombre);
            cliente.setApellido(Apellido);
            cliente.setEmail(Email);
            cliente.setDireccion(Direccion);
            cliente.setNit(Integer.parseInt(Nit));
            dao.add(cliente);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("ClienteID",request.getParameter("ClienteID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            String Nombre = request.getParameter("xNombre");
            String Apellido = request.getParameter("xApellido");
            String Email = request.getParameter("xEmail");
            String Direccion = request.getParameter("xDireccion");
            String Nit = request.getParameter("xNit");
            cliente.setClienteID(Id);
            cliente.setNombre(Nombre);
            cliente.setApellido(Apellido);
            cliente.setEmail(Email);
            cliente.setDireccion(Direccion);
            cliente.setNit(Integer.parseInt(Nit));
            dao.edit(cliente);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("ClienteID"));
            cliente.setClienteID(Id);
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
