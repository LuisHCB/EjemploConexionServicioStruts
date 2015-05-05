/**
 * JService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface JService extends java.rmi.Remote {
    public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.CompositeType getDataUsingDataContract(org.datacontract.schemas._2004._07.CompositeType composite) throws java.rmi.RemoteException;
    public java.lang.String obtenerVersion() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarReservacionMaster(java.lang.Long idDeReservacion, java.lang.String nombre, java.lang.String transactionCode, java.lang.Long noHabitacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar check_In, java.util.Calendar check_Out, java.lang.String estatusReservacion, java.lang.Integer statusReservacion) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarHuesped(java.lang.Long idDeReservacion, java.lang.String transactionCode, java.lang.Long noHabitacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar check_In, java.util.Calendar check_Out, java.lang.String estatusReservacion) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarNuevoPase(java.lang.Long idDeReservacion, java.util.Calendar vigenciaInicialEstimado, java.util.Calendar vigenciaFinalEstimado, java.util.Calendar vigenciaInicialReal, java.util.Calendar vigenciaFinalReal, java.lang.Integer tarifaId, java.lang.String nombreTarifa, java.math.BigDecimal costoNocheReal, java.math.BigDecimal costoEstaciaReal, java.lang.String observaciones, java.lang.String placasAutomovil, java.lang.String color, java.lang.String modelo) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta cambiarEstatusDeReservacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.lang.String nuevoEstatusReservacion) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta modificarCheck_OutDeReservacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar nuevoCheck_Out, java.lang.String nuevoTransaction_Code) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Modelo.Respuesta cambiarHabitacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.lang.Long nuevoNoHabitacion) throws java.rmi.RemoteException;
    public java.lang.String recuperarReservacion(java.lang.Long idDeReservacion) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Entidades.IdentidadReservaciones[] recuperarReservaciones() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Entidades.IdentidadReservacionesHuespedPases[] recuperarPases() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Entidades.IdentidadReservacionHuesped[] recuperarReservacionesHuesped() throws java.rmi.RemoteException;
}
