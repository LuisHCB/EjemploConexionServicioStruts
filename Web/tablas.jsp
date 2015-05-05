<%@ page import="org.datacontract.schemas._2004._07.Entidades.IdentidadReservaciones"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="./assets/css/bootstrap.min.css" >

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"  ></script>
<script type="text/javascript" src="./assets/js/jquery.jqGrid.min.js"  ></script>
<script type="text/javascript" src="./assets/js/i18n/grid.locale-es.js"  ></script>
<title>Insert title here</title> 
</head>
<body>
  <h2 style="text-align:center;">Reservaciones registradas</h2>
  <table class="table table-striped table-bordered table-hover " >
    <thead><tr><th>Reservacion_id</th> <th>Nombre</th> <th>StatusReservacion</th>    </thead>
    <% IdentidadReservaciones[] registros = (IdentidadReservaciones[]) request.getAttribute("registros");      %>
    <%  if(registros != null) {
    	int i=0;
         for(i=0; i<registros.length; i++ ) 
        	 {%>
           <tr>
             <td><%=registros[i].getReservacion_id() %></td>
             <td><%=registros[i].getNombre()%></td>
             <td><%=registros[i].getStatusReservacion() %></td>  
           </tr>
        	 <%}        
      } %>
  </table>
<a class="btn btn-success" href="/EjemploConexionServicioStruts">Regresar</a>  
</body>
</html>