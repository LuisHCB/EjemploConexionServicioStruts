package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;
import org.tempuri.JServiceProxy;

import beans.RegistroHuespedForm;

public class RegistroHuesped extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception
			{
		       RegistroHuespedForm objForm = (RegistroHuespedForm) form;	       
		       
		       System.out.println("reservacion:" + objForm.getH_idDeReservacion());		       
		       System.out.println("nombre:" + objForm.getH_huespedNombre());
		       return mapping.findForward("menu");
			}
}
