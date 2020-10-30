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
import models.Proveedor;
import modelsDao.ProveedorDao;

/**
 *
 * @author lgomez
 */
public class ProveedorController extends HttpServlet {

    String list = "views/proveedores/ver.jsp";
    String add = "views/proveedores/crear.jsp";
    String edit = "views/proveedores/editar.jsp";
    Proveedor proveedor= new Proveedor();
    ProveedorDao dao = new ProveedorDao();
    int Id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProveedorController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProveedorController at " + request.getContextPath() + "</h1>");
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
            String Email = request.getParameter("xEmail");
            String Direccion = request.getParameter("xDireccion");
            String Nit = request.getParameter("xNit");
            proveedor.setNombre(Nombre);
            proveedor.setApellido(Apellido);
            proveedor.setEmail(Email);
            proveedor.setDireccion(Direccion);
            proveedor.setNit(Nit);
            dao.add(proveedor);    
            access=list;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("ProveedorID",request.getParameter("ProveedorID"));
            access=edit;
        }else if(action.equalsIgnoreCase("actualizar")){
            Id = Integer.parseInt(request.getParameter("xId"));
            String Nombre = request.getParameter("xNombre");
            String Apellido = request.getParameter("xApellido");
            String Email = request.getParameter("xEmail");
            String Direccion = request.getParameter("xDireccion");
            String Nit = request.getParameter("xNit");
            proveedor.setProveedorID(Id);
            proveedor.setNombre(Nombre);
            proveedor.setApellido(Apellido);
            proveedor.setEmail(Email);
            proveedor.setDireccion(Direccion);
            proveedor.setNit(Nit);
            dao.edit(proveedor);
            access=list;
        }else if(action.equalsIgnoreCase("eliminar")){
            Id = Integer.parseInt(request.getParameter("ProveedorID"));
            proveedor.setProveedorID(Id);
            dao.delete(Id);
            access=list;
        }
                
        RequestDispatcher vista = request.getRequestDispatcher(access);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
