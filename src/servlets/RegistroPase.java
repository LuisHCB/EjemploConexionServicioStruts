package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;

import beans.RegistroPaseForm;

public class RegistroPase extends Action {
	
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) throws Exception
			{ 
		        RegistroPaseForm objForm = (RegistroPaseForm) form;
		        System.out.println("Id de reservacion: "+ objForm.getP_idDeReservacion());	
		        System.out.println("vIGENCIAiNICIAL: "+ objForm.getP_VigenciaFinalEstimado());
				return mapping.findForward("menu");
		
			}

}
