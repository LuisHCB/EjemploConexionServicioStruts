/**
 * IdentidadReservaciones.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Entidades;

public class IdentidadReservaciones  implements java.io.Serializable {
    private java.util.Calendar fechaHoraEvento;

    private java.lang.String nombre;

    private java.lang.Boolean replicaExitosa;

    private java.lang.Long reservacion_id;

    private java.lang.Integer statusReservacion;

    public IdentidadReservaciones() {
    }

    public IdentidadReservaciones(
           java.util.Calendar fechaHoraEvento,
           java.lang.String nombre,
           java.lang.Boolean replicaExitosa,
           java.lang.Long reservacion_id,
           java.lang.Integer statusReservacion) {
           this.fechaHoraEvento = fechaHoraEvento;
           this.nombre = nombre;
           this.replicaExitosa = replicaExitosa;
           this.reservacion_id = reservacion_id;
           this.statusReservacion = statusReservacion;
    }


    /**
     * Gets the fechaHoraEvento value for this IdentidadReservaciones.
     * 
     * @return fechaHoraEvento
     */
    public java.util.Calendar getFechaHoraEvento() {
        return fechaHoraEvento;
    }


    /**
     * Sets the fechaHoraEvento value for this IdentidadReservaciones.
     * 
     * @param fechaHoraEvento
     */
    public void setFechaHoraEvento(java.util.Calendar fechaHoraEvento) {
        this.fechaHoraEvento = fechaHoraEvento;
    }


    /**
     * Gets the nombre value for this IdentidadReservaciones.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this IdentidadReservaciones.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the replicaExitosa value for this IdentidadReservaciones.
     * 
     * @return replicaExitosa
     */
    public java.lang.Boolean getReplicaExitosa() {
        return replicaExitosa;
    }


    /**
     * Sets the replicaExitosa value for this IdentidadReservaciones.
     * 
     * @param replicaExitosa
     */
    public void setReplicaExitosa(java.lang.Boolean replicaExitosa) {
        this.replicaExitosa = replicaExitosa;
    }


    /**
     * Gets the reservacion_id value for this IdentidadReservaciones.
     * 
     * @return reservacion_id
     */
    public java.lang.Long getReservacion_id() {
        return reservacion_id;
    }


    /**
     * Sets the reservacion_id value for this IdentidadReservaciones.
     * 
     * @param reservacion_id
     */
    public void setReservacion_id(java.lang.Long reservacion_id) {
        this.reservacion_id = reservacion_id;
    }


    /**
     * Gets the statusReservacion value for this IdentidadReservaciones.
     * 
     * @return statusReservacion
     */
    public java.lang.Integer getStatusReservacion() {
        return statusReservacion;
    }


    /**
     * Sets the statusReservacion value for this IdentidadReservaciones.
     * 
     * @param statusReservacion
     */
    public void setStatusReservacion(java.lang.Integer statusReservacion) {
        this.statusReservacion = statusReservacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentidadReservaciones)) return false;
        IdentidadReservaciones other = (IdentidadReservaciones) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaHoraEvento==null && other.getFechaHoraEvento()==null) || 
             (this.fechaHoraEvento!=null &&
              this.fechaHoraEvento.equals(other.getFechaHoraEvento()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.replicaExitosa==null && other.getReplicaExitosa()==null) || 
             (this.replicaExitosa!=null &&
              this.replicaExitosa.equals(other.getReplicaExitosa()))) &&
            ((this.reservacion_id==null && other.getReservacion_id()==null) || 
             (this.reservacion_id!=null &&
              this.reservacion_id.equals(other.getReservacion_id()))) &&
            ((this.statusReservacion==null && other.getStatusReservacion()==null) || 
             (this.statusReservacion!=null &&
              this.statusReservacion.equals(other.getStatusReservacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFechaHoraEvento() != null) {
            _hashCode += getFechaHoraEvento().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getReplicaExitosa() != null) {
            _hashCode += getReplicaExitosa().hashCode();
        }
        if (getReservacion_id() != null) {
            _hashCode += getReservacion_id().hashCode();
        }
        if (getStatusReservacion() != null) {
            _hashCode += getStatusReservacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentidadReservaciones.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "IdentidadReservaciones"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "FechaHoraEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicaExitosa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "ReplicaExitosa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservacion_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Reservacion_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusReservacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "StatusReservacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
