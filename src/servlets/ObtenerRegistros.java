package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;
import org.datacontract.schemas._2004._07.Entidades.IdentidadReservaciones;
import org.tempuri.JServiceProxy;

public class ObtenerRegistros extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			   HttpServletRequest request, HttpServletResponse response	) throws Exception
		{	
			JServiceProxy servicio = new JServiceProxy();
			IdentidadReservaciones[] respuesta = servicio.recuperarReservaciones();		
			
			request.setAttribute("registros",respuesta);
			
			return  mapping.findForward("tablas") ;
		}

}
