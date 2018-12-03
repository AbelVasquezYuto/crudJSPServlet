package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CRUD</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"srvInsert\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <h3>Registro de clientes</h3>\n");
      out.write("            ");
      out.print(request.getParameter("msg"));
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Ingrese id</td><td><input type=\"text\" name=\"id_cliente\"></td></tr>\n");
      out.write("                <tr><td>Ingrese cedula</td><td><input type=\"text\" name=\"cedula\"></td></tr>\n");
      out.write("                <tr><td>Ingrese nombres</td><td><input type=\"text\" name=\"nombres\"></td></tr>\n");
      out.write("                <tr><td>Ingrese apellidos</td><td><input type=\"text\" name=\"apellidos\"></td></tr>\n");
      out.write("                <tr><td>Ingrese telefono</td><td><input type=\"text\" name=\"telefono\"></td></tr>\n");
      out.write("                 <tr><td>Ingrese direccion</td><td><input type=\"text\" name=\"direccion\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"GUARDAR\" name=\"save\">\n");
      out.write("            <br>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        <form action=\"srvController\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h5>Ingrese la cedula</h5></td>\n");
      out.write("                    <td><input type=\"text\" name=\"cedula\"></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"envio\" value=\"BUSCAR\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>CEDULA</th>\n");
      out.write("                            <th>NOMBRE</th>\n");
      out.write("                            <th>APELLIDO</th>\n");
      out.write("                            <th>TELEFONO</th>\n");
      out.write("                            <th>DIRECCION</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print(request.getParameter("id_cliente"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(request.getParameter("cedula"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(request.getParameter("nombres"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(request.getParameter("apellidos"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(request.getParameter("telefono"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(request.getParameter("direccion"));
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table> \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                        \n");
      out.write("        <form action=\"srvEliminar\" method=\"post\">\n");
      out.write("           <h5>Ingrese el id para eliminar: </h5>\n");
      out.write("           <input type=\"text\" name=\"id_cliente\">              \n");
      out.write("           <input type=\"submit\" name=\"eliminar\">\n");
      out.write("           ");
      out.print(request.getParameter("msg"));
      out.write("\n");
      out.write("        </form>       \n");
      out.write("        <br>\n");
      out.write("        <form action=\"srvActualiza\" method=\"post\">\n");
      out.write("            <h5>Ingrese los campos a actualizar: </h5>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input placeholder=\"Ingrese el nombre\" type=\"text\" name=\"nombres\"></td>\n");
      out.write("                    <td> <input placeholder=\"Ingrese el id del cliente\" type=\"text\" name=\"id_cliente\">    </td>\n");
      out.write("                    <td> <input type=\"submit\" name=\"actualizar\"></td>\n");
      out.write("                    <td> ");
      out.print(request.getParameter("msg"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("        </form> \n");
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
