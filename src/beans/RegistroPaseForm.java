package beans;

import java.sql.Date;

import org.apache.struts.action.ActionForm;

public class RegistroPaseForm extends ActionForm {
	
	private long P_idDeReservacion;
	private Date P_VigenciaInicialEstimado;
	private Date P_VigenciaFinalEstimado;
	private Date P_VigenciaInicialReal;
	private Date P_VigenciaFinalReal;
	private long P_tarifaId;
	private String P_nombreTarifa;
	private String P_costoNocheReal;
	private String P_costoEstanciaReal;
	private String P_Observaciones;
	private String P_placasAutomovil;
	private String P_color;
	private String P_modelo;
	
	public long getP_idDeReservacion() {
		return P_idDeReservacion;
	}
	public void setP_idDeReservacion(long p_idDeReservacion) {
		P_idDeReservacion = p_idDeReservacion;
	}
	public Date getP_VigenciaInicialEstimado() {
		return P_VigenciaInicialEstimado;
	}
	public void setP_VigenciaInicialEstimado(Date p_VigenciaInicialEstimado) {
		P_VigenciaInicialEstimado = p_VigenciaInicialEstimado;
	}
	public Date getP_VigenciaFinalEstimado() {
		return P_VigenciaFinalEstimado;
	}
	public void setP_VigenciaFinalEstimado(Date p_VigenciaFinalEstimado) {
		P_VigenciaFinalEstimado = p_VigenciaFinalEstimado;
	}
	public Date getP_VigenciaInicialReal() {
		return P_VigenciaInicialReal;
	}
	public void setP_VigenciaInicialReal(Date p_VigenciaInicialReal) {
		P_VigenciaInicialReal = p_VigenciaInicialReal;
	}
	public Date getP_VigenciaFinalReal() {
		return P_VigenciaFinalReal;
	}
	public void setP_VigenciaFinalReal(Date p_VigenciaFinalReal) {
		P_VigenciaFinalReal = p_VigenciaFinalReal;
	}
	public long getP_tarifaId() {
		return P_tarifaId;
	}
	public void setP_tarifaId(long p_tarifaId) {
		P_tarifaId = p_tarifaId;
	}
	public String getP_nombreTarifa() {
		return P_nombreTarifa;
	}
	public void setP_nombreTarifa(String p_nombreTarifa) {
		P_nombreTarifa = p_nombreTarifa;
	}
	public String getP_costoNocheReal() {
		return P_costoNocheReal;
	}
	public void setP_costoNocheReal(String p_costoNocheReal) {
		P_costoNocheReal = p_costoNocheReal;
	}
	public String getP_costoEstanciaReal() {
		return P_costoEstanciaReal;
	}
	public void setP_costoEstanciaReal(String p_costoEstanciaReal) {
		P_costoEstanciaReal = p_costoEstanciaReal;
	}
	public String getP_Observaciones() {
		return P_Observaciones;
	}
	public void setP_Observaciones(String p_Observaciones) {
		P_Observaciones = p_Observaciones;
	}
	public String getP_placasAutomovil() {
		return P_placasAutomovil;
	}
	public void setP_placasAutomovil(String p_placasAutomovil) {
		P_placasAutomovil = p_placasAutomovil;
	}
	public String getP_color() {
		return P_color;
	}
	public void setP_color(String p_color) {
		P_color = p_color;
	}
	public String getP_modelo() {
		return P_modelo;
	}
	public void setP_modelo(String p_modelo) {
		P_modelo = p_modelo;
	}
	

}
