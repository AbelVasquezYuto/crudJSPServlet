package datos;

import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    
   private Connection _connection=null;
   PreparedStatement ps = null;
   ResultSet rs=null;
   
    public Connection conectar(){
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            _connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","mysqltlv250296");
            System.out.println("CONECTADO");
            } 
        
        catch (SQLException e) {
            System.out.println("Error al registrar el controlador"+ e.getMessage());
            }
        
        return _connection;
    }
    
    public LinkedList<Cliente> consultaClientes(String conSQL){
        
        LinkedList <Cliente> listaClientes = new LinkedList<Cliente>();
        
        try{
            ps = conectar().prepareStatement(conSQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
            
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setCedula(rs.getString("cedula"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                
                listaClientes.add(cliente);
                
            }
            
            ps.close();
            rs.close();
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
        
        return listaClientes;
    }
    
    public void insert(String inSQL){
        try{
            ps = conectar().prepareStatement(inSQL);
            ps.executeUpdate(inSQL);
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }
    
     public void eliminar(Integer id_cliente){
        try{
            ps = conectar().prepareStatement("delete from clientes where id_cliente="+id_cliente+";");
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }
     
    public void actualizar(String newNombre,Integer id_cliente){
        try{
            ps = conectar().prepareStatement("update clientes set nombres='"+newNombre+"' where id_cliente="+id_cliente+";");
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }
    
    //PARA LOS NUMEROS AUTOINCREMENTADOS FEIKS
    public String obtenerUltimo(String conSQL,String campo){
       String datos="";
       try {
           ps = conectar().prepareStatement(conSQL);
           rs = ps.executeQuery();
           
           while(rs.next()){
               datos = rs.getString(campo);
           }
           
           
       } catch (SQLException ex) {
            System.out.println("ERROR "+ex.getMessage());
       }
        return datos;
    }
    
  
}
