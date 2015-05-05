<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="org.datacontract.schemas._2004._07.Entidades.IdentidadReservacionHuesped"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./assets/css/bootstrap.min.css" >
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center;">Huesped registrados</h2>
  <table class="table table-striped table-bordered table-hover " >
    <thead><tr><th>Reservacion_id</th> <th>Habitación</th> <th>Nombre</th>  
    <th>Apellidos</th> <th>Check In</th>  
    <th>Check Out</th> <th>Estatus reservacion</th> <th>Huesped Master</th>
    <th>Transaction code</th></tr></thead>
    <% IdentidadReservacionHuesped[] registros = (IdentidadReservacionHuesped[]) request.getAttribute("registros");      %>
    <%  if(registros != null) {
    	int i=0;
         for(i=0; i<registros.length; i++ ) 
        	 {%>
           <tr>
             <td><%=registros[i].getReservacion_id() %></td>             
             <td><%=registros[i].getNoHabitacion() %></td>
             <td><%=registros[i].getHuespedNombre() %></td>
             <td><%=registros[i].getHuespedApellidos() %></td>             
             <td><%=registros[i].getCheck_In().getTime().toString() %></td>  
             <td><%=registros[i].getCheck_Out().getTime().toString() %></td>
             <td><%=registros[i].getEstatusReservacion() %></td>
             <td><%=registros[i].getHuespedMaster() %></td>
             <td><%=registros[i].getTransaction_Code() %></td>
           </tr>
        	 <%}        
      } %>
  </table> 
<a class="btn btn-success" href="/EjemploConexionServicioStruts">Regresar</a>
</body>
</html>