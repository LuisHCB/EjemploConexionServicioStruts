package beans;

import java.sql.Date;

import org.apache.struts.action.*;

public class RegistroHuespedForm extends ActionForm {
	             
	private long H_idDeReservacion;	
	private String H_transactionCode;
	private long H_noHabitacion;
	private String H_huespedNombre;
	private String H_huespedApellido;
	private Date H_checkIn;
	private Date H_checkOut;	
	private String H_estatusReservacion;
	
	public long getH_idDeReservacion() {
		return this.H_idDeReservacion;
	}
	public void setH_idDeReservacion(long H_idDeReservacion) {
		this.H_idDeReservacion = H_idDeReservacion;
	}
	public String getH_transactionCode() {
		return this.H_transactionCode;
	}
	public void setH_transactionCode(String H_transactionCode) {
		this.H_transactionCode = H_transactionCode;
	}
	public long getH_noHabitacion() {
		return this.H_noHabitacion;
	}
	public void setH_noHabitacion(long H_noHabitacion) {
		this.H_noHabitacion = H_noHabitacion;
	}
	public String getH_huespedNombre() {
		return this.H_huespedNombre;
	}
	public void setH_huespedNombre(String H_huespedNombre) {
		this.H_huespedNombre = H_huespedNombre;
	}
	public String getH_huespedApellido() {
		return this.H_huespedApellido;
	}
	public void setH_huespedApellido(String H_huespedApellido) {
		this.H_huespedApellido = H_huespedApellido;
	}
	public Date getH_checkIn() {
		return this.H_checkIn;
	}
	public void setH_checkIn(Date H_checkIn) {
		this.H_checkIn = H_checkIn;
	}
	public Date getH_checkOut() {
		return this.H_checkOut;
	}
	public void setH_checkOut(Date H_checkOut) {
		this.H_checkOut = H_checkOut;
	}
	public String getH_estatusReservacion() {
		return this.H_estatusReservacion;
	}
	public void setH_estatusReservacion(String H_estatusReservacion) {
		this.H_estatusReservacion = H_estatusReservacion;
	}
	  
}
