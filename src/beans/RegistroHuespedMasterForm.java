package beans;

import java.sql.Date;

import org.apache.struts.action.*;

public class RegistroHuespedMasterForm extends ActionForm {
	
	  private long idDeReservacion;
	  private String nombre;
	  private String transactionCode;
	  private long noHabitacion;
	  private String huespedNombre;
	  private String huespedApellido;
	  private Date checkIn;
	  private Date checkOut;
	  private int statusReservacion;
	  private String estatusReservacion;
	  
		public long getIdDeReservacion() {
			return idDeReservacion;
		}
	
		public void setIdDeReservacion(long idDeReservacion) {
			this.idDeReservacion = idDeReservacion;
		}
	
		public String getNombre() {
			return nombre;
		}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public String getTransactionCode() {
			return transactionCode;
		}
	
		public void setTransactionCode(String transactionCode) {
			this.transactionCode = transactionCode;
		}
	
		public long getNoHabitacion() {
			return noHabitacion;
		}
	
		public void setNoHabitacion(long noHabitacion) {
			this.noHabitacion = noHabitacion;
		}
	
		public String getHuespedNombre() {
			return huespedNombre;
		}
	
		public void setHuespedNombre(String huespedNombre) {
			this.huespedNombre = huespedNombre;
		}
	
		public String getHuespedApellido() {
			return huespedApellido;
		}
	
		public void setHuespedApellido(String huespedApellido) {
			this.huespedApellido = huespedApellido;
		}
	
		public Date getCheckIn() {
			return checkIn;
		}
	
		public void setCheckIn(Date checkIn) {
			this.checkIn = checkIn;
		}
	
		public Date getCheckOut() {
			return checkOut;
		}
	
		public void setCheckOut(Date checkOut) {
			this.checkOut = checkOut;
		}
	
		public int getStatusReservacion() {
			return statusReservacion;
		}
	
		public void setStatusReservacion(int statusReservacion) {
			this.statusReservacion = statusReservacion;
		}
	
		public String getEstatusReservacion() {
			return estatusReservacion;
		}
	
		public void setEstatusReservacion(String estatusReservacion) {
			this.estatusReservacion = estatusReservacion;
		}
	  
	  
	  

}
