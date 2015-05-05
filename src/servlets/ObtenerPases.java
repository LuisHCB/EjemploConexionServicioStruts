package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;
import org.datacontract.schemas._2004._07.Entidades.IdentidadReservaciones;
import org.datacontract.schemas._2004._07.Entidades.IdentidadReservacionesHuespedPases;
import org.tempuri.JServiceProxy;

public class ObtenerPases extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			   HttpServletRequest request, HttpServletResponse response	) throws Exception
		{	
			JServiceProxy servicio = new JServiceProxy();
			IdentidadReservacionesHuespedPases[] respuesta = servicio.recuperarPases();		
			
			request.setAttribute("registros",respuesta);
			
			return  mapping.findForward("pases") ;
		}

}
