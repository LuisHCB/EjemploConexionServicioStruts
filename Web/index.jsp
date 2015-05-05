<%@ page import="org.datacontract.schemas._2004._07.Modelo.Respuesta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" 
xmlns:h="http://java.sun.com/jsf/html"
xmlns:f="http://java.sun.com/jsf/core"
xmlns:p="http://primefaces.org/ui" >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./assets/css/bootstrap.min.css" >

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="./assets/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="./assets/js/notify.min.js"></script>

<title>Insert title here</title>
</head>
<body style="background-color:#000;">
	<h1 style="text-align:center; color:#fff;" >Sistema demo para registro en web service Jorbee</h1>
<div class="col-md-12">
<div class="well"   style="background-color:#5cb85c; border-color:#eee; ">
		<!-- Grupo de botones necesario -->
		<div class="btn-group btn-group-justified" data-toggle="buttons">
			<label class="btn btn-success" style="border-color: #5cb85c"
				data-toggle="collapse"
				data-target="#form-registrar-reservacion"
				aria-expanded="false"
				aria-controls="form-registrar-reservacion"
				data-parent="#formularios"> <input
				type="radio" id=""
				autocomplete="off"> <span
				class="glyphicon glyphicon-file"></span> </br> <strong>
					Registro de nueva <br/> reservación como master </strong>
			</label> 
			<label class="btn btn-success" style="border-color: #5cb85c"
				data-toggle="collapse"
				data-target="#form-registrar-reservacion-existente"
				aria-expanded="false"
				aria-controls="form-registrar-reservacion-existente"
				data-parent="#formularios"> <input
				type="radio" id="V-registrar_RB-solicitud"
				autocomplete="off"> <span class="glyphicon glyphicon-file"></span>
				</br> <strong> Registro de Huesped <br/>con reservación ya existente </strong>
			</label>
			<label class="btn btn-success" style="border-color: #5cb85c"
				data-toggle="collapse"
				data-target="#form-registrar-pase"
				aria-expanded="false"
				aria-controls="form-registrar-pase"
				data-parent="#formularios"> <input
				type="radio" id=""
				autocomplete="off"> <span class="glyphicon glyphicon-file"></span>
				</br> <strong> Registro de nuevo pase <br/>con reservación ya existente </strong>
			</label>
		</div>
		
		
		<!-- Fin Grupo de botones necesario ::::::::::::::::::::::::-->
    <div class="panel-group" id="formularios" role="tablist" aria-multiselectable="true" style="color:white">
    <div class="panel panel-default" style="background-color:#5cb85c; border-color:#5cb85c"> <!-- necesario para evitar abrir mas de una ventana -->
    <br/>
    <div class="collapse " id="form-registrar-reservacion">   <!-- formulario 1 -->
	<fieldset>	
	    <html:form action="/registroHuespedMaster" method="post" styleClass="form-horizontal">
	       <hr/>	
	    	<div class="form-group">
				<label class="col-md-3 control-label" for="idDeReservacion" >Id de reservación</label>
				<div  class=" col-md-5 ">
				 <input class="form-control" type="number" name="idDeReservacion" required />
				</div>
			</div> 
			
			<div class="form-group">
				<label class="col-sm-3 control-label" for="nombre" >Nombre</label>
				<div  class=" col-md-5 "> 
					<input class="form-control "	type="text" name="nombre" required />
				</div>
			</div> 
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="transactionCode" >Transaction code</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="transactionCode" required />
				</div>
			</div>
			 
			<div class="form-group">
				<label class="col-sm-3 control-label" 	for="noHabitacion">Número de habitación</label> 
				<div  class=" col-md-5 ">
					<input class="form-control" type="number" name="noHabitacion" min=0 required />
				</div> 
			</div>
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="huespedNombre" >Nombre del huesped</label> 
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="huespedNombre" required />
				</div> 
			</div>
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="huespedApellido" >Apellidos del huesped</label>
				<div  class=" col-md-5 ">			
					<input class="form-control" type="text" name="huespedApellido" required />
				</div>
			</div> 
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="checkIn" >Check In</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="checkIn"  required />
				</div>
			</div> 
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="checkOut">Check Out</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="checkOut" required />
				</div>
			</div> 
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="statusReservacion" >Status de reservación</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="number" name="statusReservacion" required min =0 />
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-3 control-label"  for="estatusReservacion" >Estatus de reservación</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="estatusReservacion" required />
				</div>
			</div>
			
			<div class="col-sm-offset-4">
				<button class="btn btn-success " type="submit">Registrar</button>
				<button class="btn btn-warning " type="reset">Borrar formulario</button>
			</div>
	    </html:form>
	</fieldset>
	</div>
	<!-- Registro de huesped -->
	<div class="collapse " id="form-registrar-reservacion-existente">   <!-- formulario 2 -->
	<fieldset>
		<hr/>
	    <html:form action="/registroHuesped" method="post" styleClass="form-horizontal" >
	        <div class="form-group">
				<label class="col-sm-3 control-label" for="h_idDeReservacion" >Id de reservación</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="number" name="h_idDeReservacion" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_transactionCode" >Transaction code</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="h_transactionCode" required />
				</div>
			</div>
			<div class="form-group"> 
				<label	class="col-sm-3 control-label" for="h_noHabitacion">Número de habitación</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="number" name="h_noHabitacion" min=0 required />
				</div>
			</div> 
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_huespedNombre" >Nombre del huesped</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="text" name="h_huespedNombre" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_huespedApellido" >Apellidos del huesped</label>
				<div  class=" col-md-5 ">			
					<input class="form-control" type="text" name="h_huespedApellido" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_checkIn" >Check In</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="h_checkIn"  required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_checkOut">Check Out</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="h_checkOut" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="h_estatusReservacion" >Estatus de reservación</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="h_estatusReservacion" required />
				</div>
			</div>
			<div class="col-sm-offset-4">
				<button class="btn btn-success" type="submit">Registrar</button>
				<button class="btn btn-warning" type="reset">Borrar formulario</button>
			</div>
	 </html:form>
	</fieldset>
	</div>
	<!-- Registro de Pase -->
	<div class="collapse" id="form-registrar-pase">   <!-- formulario 3 -->
	<fieldset>
		<hr/>
		<html:form action="/registroPase" method="post" styleClass="form-horizontal">
		    <div class="form-group">
				<label class="col-sm-3 control-label" for="p_idDeReservacion" >Id de reservación</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="number"name="p_idDeReservacion" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_VigenciaInicialEstimado" >Vigencia inicial estimada</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="p_VigenciaInicialEstimado"  required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_VigenciaFinalEstimado" >Vigencia final estimada</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="p_VigenciaFinalEstimado"  required />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_VigenciaInicialReal" >Vigencia inicial real</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="p_VigenciaInicialReal"  required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_VigenciaFinalReal" >Vigencia final real</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="date" name="p_VigenciaFinalReal"  required />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_tarifaId" >Id de tarifa</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="number" name="p_tarifaId" required />
				</div>
			</div>
			<div class="form-group">
				<label	class="col-sm-3 control-label" for="p_nombreTarifa">Nombre de tarifa</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="text" name="p_nombreTarifa" required />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_costoNocheReal" >Costo noche real</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="text" name="p_costoNocheReal" required />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_costoEstanciaReal" >Costo estancia real</label>
				<div  class=" col-md-5 "> 
					<input class="form-control" type="text" name="p_costoEstanciaReal" required />
				</div>  
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_observaciones" >Observaciones</label>
				<div  class=" col-md-5 ">			
					<textarea class="form-control"  name="p_observaciones"  > </textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_placasAutomovil" >Placas de automovil</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="p_placasAutomovil"   />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_color">Color del carro</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="p_color" />
				</div> 
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label" for="p_modelo">Modelo del carro</label>
				<div  class=" col-md-5 ">
					<input class="form-control" type="text" name="p_modelo" />
				</div>
			</div>
			<div class="col-sm-offset-4 ">
				<button class="btn btn-success" type="submit">Registrar</button>
				<button class="btn btn-warning" type="reset">Borrar formulario</button>
			</div>
	   </html:form>
	</fieldset>
	</div>
	</div>
	</div>
</div>
</div>
<a class="btn btn-info" href="/EjemploConexionServicioStruts/obtenerRegistros.do" >Ver lista de reservaciones</a>
<a class="btn btn-info" href="/EjemploConexionServicioStruts/obtenerRegistrosHuesped.do">Ver lista de huesped</a>
<a class="btn btn-info" href="/EjemploConexionServicioStruts/obtenerPases.do">Ver lista de pases</a>
<% Respuesta r = (Respuesta) request.getAttribute("Respuesta");
    if(r!=null)
     if(!r.getResultado()) 
     {%>
     <script type="text/javascript">     
    	$.notify("<%=r.getMensaje()%>",{globalPosition: 'top center',className: 'error',});
     </script>
    <% 
     }     
     else
     {%>
     <script type="text/javascript">     
    	$.notify("<%=r.getMensaje()%>",{globalPosition: 'top center',className: 'success',});
     </script>
    <% }
     %>
</body>
</html>