package org.apache.jsp.views.usuarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crear_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- inicia el navbar -->\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"../ProyectoFinalAlligator/home.jsp\">Alligator</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Productos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Configuración\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp; Sesiones\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"UsuarioController?accion=listar\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Usuarios</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Roles</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Asignación de Usuarios</a>\n");
      out.write("                            </div>    \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <form class=\"form-signin\" widht=\"\" heigth=\"\" action=\"home.jsp\">\n");
      out.write("            <center>\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <img class=\"mb-4\" src=\"https://image.flaticon.com/icons/png/512/65/65685.png\" alt=\"\" width=\"150\" height=\"150\">\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" id=\"inputNombre\" class=\"form-control\" placeholder=\"Ingrese sus Nombres\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input type=\"text\" id=\"inputApellido\" class=\"form-control\" placeholder=\"Ingrese sus Apellidos\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input type=\"text\" id=\"inputUsuario\" class=\"form-control\" placeholder=\"Ingrese un Nombre de Usuario\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input type=\"password\" id=\"inputContrasea\" class=\"form-control\" placeholder=\"Ingrese una Contraseña\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input type=\"password\" id=\"inputContraseaConfirm\" class=\"form-control\" placeholder=\"Confirme la Contraseña\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Ingrese un Correo Electronico\" required=\"\">\n");
      out.write("                    <input type=\"text\" id=\"inputContrasea\" class=\"form-control\" placeholder=\"Ingrese sus Apellidos\" required=\"\" autofocus=\"\">\n");
      out.write("                    <br/>\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Guardar</button>\n");
      out.write("       \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
