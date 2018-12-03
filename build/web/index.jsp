
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD</title>
    </head>
    <body>
        
        <form action="srvInsert" method="post">
            
            <h3>Registro de clientes</h3>
            <%=request.getParameter("msg")%>
            
            <table>
                <tr><td>Ingrese id</td><td><input type="text" name="id_cliente"></td></tr>
                <tr><td>Ingrese cedula</td><td><input type="text" name="cedula"></td></tr>
                <tr><td>Ingrese nombres</td><td><input type="text" name="nombres"></td></tr>
                <tr><td>Ingrese apellidos</td><td><input type="text" name="apellidos"></td></tr>
                <tr><td>Ingrese telefono</td><td><input type="text" name="telefono"></td></tr>
                <tr><td>Ingrese direccion</td><td><input type="text" name="direccion"></td></tr>
            </table>
            <input type="submit" value="GUARDAR" name="save">
            <br>
        </form>
            
        <form action="srvController" method="post">
            <table>
                <tr>
                    <td><h5>Ingrese la cedula</h5></td>
                    <td><input type="text" name="cedula"></td>
                    <td><input type="submit" name="envio" value="BUSCAR"></td>
                </tr>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>CEDULA</th>
                            <th>NOMBRE</th>
                            <th>APELLIDO</th>
                            <th>TELEFONO</th>
                            <th>DIRECCION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th><%=request.getParameter("id_cliente")%></th>
                            <th><%=request.getParameter("cedula")%></th>
                            <th><%=request.getParameter("nombres")%></th>
                            <th><%=request.getParameter("apellidos")%></th>
                            <th><%=request.getParameter("telefono")%></th>
                            <th><%=request.getParameter("direccion")%></th>
                        </tr>
                    </tbody>
                </table> 
            </table>
        </form>
                        
        <form action="srvEliminar" method="post">
           <h5>Ingrese el id para eliminar: </h5>
           <input type="text" name="id_cliente">              
           <input type="submit" name="eliminar">
           <%=request.getParameter("msg")%>
        </form>       
        <br>
        <form action="srvActualiza" method="post">
            <h5>Ingrese los campos a actualizar: </h5>
            <table>
                <tr>
                    <td><input placeholder="Ingrese el nombre" type="text" name="nombres"></td>
                    <td> <input placeholder="Ingrese el id del cliente" type="text" name="id_cliente">    </td>
                    <td> <input type="submit" name="actualizar"></td>
                    <td> <%=request.getParameter("msg")%></td>
                </tr>
            </table>
             
        </form> 
        
    </body>
</html>
