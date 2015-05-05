<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.datacontract.schemas._2004._07.Entidades.IdentidadReservacionesHuespedPases"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="./assets/css/bootstrap.min.css" >
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center;">Pases de huesped registrados</h2>
  <table class="table table-striped table-bordered table-hover " >
    <thead><tr><th>Reservacion_id</th> <th>VigenciaFinalEstimado</th> <th>VigenciaFinalReal</th>  
    <th>VigenciaInicialEstimado</th> <th>VigenciaInicialReal</th>  
    <th>CostoEstanciaReal</th> <th>CostoNocheReal</th> <th>Tarifa_id</th>
    <th>Tarifa</th> <th>Modelo</th> <th>PlacasAutomovil</th>
    <th>Observaciones</th></tr></thead>
    <% IdentidadReservacionesHuespedPases[] registros = (IdentidadReservacionesHuespedPases[]) request.getAttribute("registros");      %>
    <%  if(registros != null) {
    	int i=0;
         for(i=0; i<registros.length; i++ ) 
        	 {%>
           <tr>
             <td><%=registros[i].getReservacion_id() %></td>
             <td><%=registros[i].getVigenciaFinalEstimado().getTime().toString()%></td>
             <td><%=registros[i].getVigenciaFinalReal().getTime().toString() %></td>  
             <td><%=registros[i].getVigenciaInicialEstimado().getTime().toString() %></td>
             <td><%=registros[i].getVigenciaInicialReal().getTime().toString() %></td>
             <td><%=registros[i].getCostoEstanciaReal() %></td>
             <td><%=registros[i].getCostoNocheReal() %></td>
             <td><%=registros[i].getTarifa_id() %></td>
             <td><%=registros[i].getTarifa() %></td>
             <td><%=registros[i].getModelo() %></td>
             <td><%=registros[i].getPlacasAutomovil() %></td>
             <td><%=registros[i].getObservaciones() %></td>             
           </tr>
        	 <%}        
      } %>
  </table>  
<a class="btn btn-success" href="/EjemploConexionServicioStruts">Regresar</a>
</body>
</html>