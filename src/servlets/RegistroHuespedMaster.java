package servlets;

import java.util.Calendar;

import org.apache.struts.action.*;
import org.datacontract.schemas._2004._07.Modelo.Respuesta;
import org.tempuri.JServiceProxy;

import beans.RegistroHuespedMasterForm;

import javax.servlet.http.*;

public class RegistroHuespedMaster extends Action {
	
	public ActionForward execute ( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		Calendar chekIn = Calendar.getInstance();
		Calendar chekOut = Calendar.getInstance();		
		RegistroHuespedMasterForm objForm = (RegistroHuespedMasterForm) form;
		JServiceProxy servicio = new JServiceProxy();
	       System.out.println("Version del servicio: "+servicio.obtenerVersion());
	       
	     chekIn.setTime(objForm.getCheckIn());
		 chekIn.setTime(objForm.getCheckIn());
			
		System.out.println("Nombre: "+ objForm.getIdDeReservacion());
		System.out.println("Nombre: "+ objForm.getNombre());
		System.out.println("CheckIn: "+ objForm.getCheckIn().toString());
		System.out.println("CheckOut: "+ objForm.getCheckOut().toString());
		
		Respuesta respuesta = servicio.registrarReservacionMaster
				(objForm.getIdDeReservacion(),objForm.getNombre(),
						objForm.getTransactionCode(),objForm.getNoHabitacion(),
						objForm.getHuespedNombre(),objForm.getHuespedApellido(),
						chekIn,chekOut,
						objForm.getEstatusReservacion(),objForm.getStatusReservacion());
		System.out.println("Resultado de la peticion: "+respuesta.getMensaje());
		
	  return mapping.findForward("menu");
	}

}
