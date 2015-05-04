package org.tempuri;

public class JServiceProxy implements org.tempuri.JService {
  private String _endpoint = null;
  private org.tempuri.JService jService = null;
  
  public JServiceProxy() {
    _initJServiceProxy();
  }
  
  public JServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initJServiceProxy();
  }
  
  private void _initJServiceProxy() {
    try {
      jService = (new org.tempuri.ServicioLocator()).getBasicHttpBinding_JService();
      if (jService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jService != null)
      ((javax.xml.rpc.Stub)jService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.JService getJService() {
    if (jService == null)
      _initJServiceProxy();
    return jService;
  }
  
  public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.getData(value);
  }
  
  public org.datacontract.schemas._2004._07.CompositeType getDataUsingDataContract(org.datacontract.schemas._2004._07.CompositeType composite) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.getDataUsingDataContract(composite);
  }
  
  public java.lang.String obtenerVersion() throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.obtenerVersion();
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarReservacionMaster(java.lang.Long idDeReservacion, java.lang.String nombre, java.lang.String transactionCode, java.lang.Long noHabitacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar check_In, java.util.Calendar check_Out, java.lang.String estatusReservacion, java.lang.Integer statusReservacion) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.registrarReservacionMaster(idDeReservacion, nombre, transactionCode, noHabitacion, huespedNombre, huespedApellidos, check_In, check_Out, estatusReservacion, statusReservacion);
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarHuesped(java.lang.Long idDeReservacion, java.lang.String transactionCode, java.lang.Long noHabitacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar check_In, java.util.Calendar check_Out, java.lang.String estatusReservacion) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.registrarHuesped(idDeReservacion, transactionCode, noHabitacion, huespedNombre, huespedApellidos, check_In, check_Out, estatusReservacion);
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta registrarNuevoPase(java.lang.Long idDeReservacion, java.util.Calendar vigenciaInicialEstimado, java.util.Calendar vigenciaFinalEstimado, java.util.Calendar vigenciaInicialReal, java.util.Calendar vigenciaFinalReal, java.lang.Integer tarifaId, java.lang.String nombreTarifa, java.math.BigDecimal costoNocheReal, java.math.BigDecimal costoEstaciaReal, java.lang.String observaciones, java.lang.String placasAutomovil, java.lang.String color, java.lang.String modelo) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.registrarNuevoPase(idDeReservacion, vigenciaInicialEstimado, vigenciaFinalEstimado, vigenciaInicialReal, vigenciaFinalReal, tarifaId, nombreTarifa, costoNocheReal, costoEstaciaReal, observaciones, placasAutomovil, color, modelo);
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta cambiarEstatusDeReservacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.lang.String nuevoEstatusReservacion) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.cambiarEstatusDeReservacion(idDeReservacion, huespedNombre, huespedApellidos, nuevoEstatusReservacion);
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta modificarCheck_OutDeReservacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.util.Calendar nuevoCheck_Out, java.lang.String nuevoTransaction_Code) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.modificarCheck_OutDeReservacion(idDeReservacion, huespedNombre, huespedApellidos, nuevoCheck_Out, nuevoTransaction_Code);
  }
  
  public org.datacontract.schemas._2004._07.Modelo.Respuesta cambiarHabitacion(java.lang.Long idDeReservacion, java.lang.String huespedNombre, java.lang.String huespedApellidos, java.lang.Long nuevoNoHabitacion) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.cambiarHabitacion(idDeReservacion, huespedNombre, huespedApellidos, nuevoNoHabitacion);
  }
  
  public java.lang.String recuperarReservacion(java.lang.Long idDeReservacion) throws java.rmi.RemoteException{
    if (jService == null)
      _initJServiceProxy();
    return jService.recuperarReservacion(idDeReservacion);
  }
  
  
}