/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srvConsultas;

import datos.Cliente;
import datos.ConexionBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABEL
 */
@WebServlet(name = "srvController", urlPatterns = {"/srvController"})
public class srvController extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        ConexionBD conexionBD = new ConexionBD(); 
        
        if(request.getParameter("envio")!=null){
             //where cedula ='"+request.getParameter("cedula")+"'
            LinkedList<Cliente> lista = conexionBD.consultaClientes("select id_cliente, cedula, nombres, apellidos, telefono, direccion from clientes where cedula ='"+request.getParameter("cedula")+"';");
            
            for(int i=0;i<lista.size();i++){
                response.sendRedirect("index.jsp?id_cliente="+lista.get(i).getId_cliente().toString()+
                        "&cedula="+lista.get(i).getCedula()+
                        "&nombres="+lista.get(i).getNombres()+
                        "&apellidos="+lista.get(i).getApellidos()+
                        "&telefono="+lista.get(i).getTelefono()+
                        "&direccion="+lista.get(i).getDireccion()
                        );
            }
            
            
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
