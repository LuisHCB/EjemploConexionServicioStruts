/**
 * IdentidadReservacionHuesped.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Entidades;

public class IdentidadReservacionHuesped  implements java.io.Serializable {
    private java.util.Calendar check_In;

    private java.util.Calendar check_Out;

    private java.lang.String estatusReservacion;

    private java.lang.String huespedApellidos;

    private java.lang.Boolean huespedMaster;

    private java.lang.String huespedNombre;

    private java.lang.Long noHabitacion;

    private java.lang.Long reservacion_id;

    private java.lang.String transaction_Code;

    public IdentidadReservacionHuesped() {
    }

    public IdentidadReservacionHuesped(
           java.util.Calendar check_In,
           java.util.Calendar check_Out,
           java.lang.String estatusReservacion,
           java.lang.String huespedApellidos,
           java.lang.Boolean huespedMaster,
           java.lang.String huespedNombre,
           java.lang.Long noHabitacion,
           java.lang.Long reservacion_id,
           java.lang.String transaction_Code) {
           this.check_In = check_In;
           this.check_Out = check_Out;
           this.estatusReservacion = estatusReservacion;
           this.huespedApellidos = huespedApellidos;
           this.huespedMaster = huespedMaster;
           this.huespedNombre = huespedNombre;
           this.noHabitacion = noHabitacion;
           this.reservacion_id = reservacion_id;
           this.transaction_Code = transaction_Code;
    }


    /**
     * Gets the check_In value for this IdentidadReservacionHuesped.
     * 
     * @return check_In
     */
    public java.util.Calendar getCheck_In() {
        return check_In;
    }


    /**
     * Sets the check_In value for this IdentidadReservacionHuesped.
     * 
     * @param check_In
     */
    public void setCheck_In(java.util.Calendar check_In) {
        this.check_In = check_In;
    }


    /**
     * Gets the check_Out value for this IdentidadReservacionHuesped.
     * 
     * @return check_Out
     */
    public java.util.Calendar getCheck_Out() {
        return check_Out;
    }


    /**
     * Sets the check_Out value for this IdentidadReservacionHuesped.
     * 
     * @param check_Out
     */
    public void setCheck_Out(java.util.Calendar check_Out) {
        this.check_Out = check_Out;
    }


    /**
     * Gets the estatusReservacion value for this IdentidadReservacionHuesped.
     * 
     * @return estatusReservacion
     */
    public java.lang.String getEstatusReservacion() {
        return estatusReservacion;
    }


    /**
     * Sets the estatusReservacion value for this IdentidadReservacionHuesped.
     * 
     * @param estatusReservacion
     */
    public void setEstatusReservacion(java.lang.String estatusReservacion) {
        this.estatusReservacion = estatusReservacion;
    }


    /**
     * Gets the huespedApellidos value for this IdentidadReservacionHuesped.
     * 
     * @return huespedApellidos
     */
    public java.lang.String getHuespedApellidos() {
        return huespedApellidos;
    }


    /**
     * Sets the huespedApellidos value for this IdentidadReservacionHuesped.
     * 
     * @param huespedApellidos
     */
    public void setHuespedApellidos(java.lang.String huespedApellidos) {
        this.huespedApellidos = huespedApellidos;
    }


    /**
     * Gets the huespedMaster value for this IdentidadReservacionHuesped.
     * 
     * @return huespedMaster
     */
    public java.lang.Boolean getHuespedMaster() {
        return huespedMaster;
    }


    /**
     * Sets the huespedMaster value for this IdentidadReservacionHuesped.
     * 
     * @param huespedMaster
     */
    public void setHuespedMaster(java.lang.Boolean huespedMaster) {
        this.huespedMaster = huespedMaster;
    }


    /**
     * Gets the huespedNombre value for this IdentidadReservacionHuesped.
     * 
     * @return huespedNombre
     */
    public java.lang.String getHuespedNombre() {
        return huespedNombre;
    }


    /**
     * Sets the huespedNombre value for this IdentidadReservacionHuesped.
     * 
     * @param huespedNombre
     */
    public void setHuespedNombre(java.lang.String huespedNombre) {
        this.huespedNombre = huespedNombre;
    }


    /**
     * Gets the noHabitacion value for this IdentidadReservacionHuesped.
     * 
     * @return noHabitacion
     */
    public java.lang.Long getNoHabitacion() {
        return noHabitacion;
    }


    /**
     * Sets the noHabitacion value for this IdentidadReservacionHuesped.
     * 
     * @param noHabitacion
     */
    public void setNoHabitacion(java.lang.Long noHabitacion) {
        this.noHabitacion = noHabitacion;
    }


    /**
     * Gets the reservacion_id value for this IdentidadReservacionHuesped.
     * 
     * @return reservacion_id
     */
    public java.lang.Long getReservacion_id() {
        return reservacion_id;
    }


    /**
     * Sets the reservacion_id value for this IdentidadReservacionHuesped.
     * 
     * @param reservacion_id
     */
    public void setReservacion_id(java.lang.Long reservacion_id) {
        this.reservacion_id = reservacion_id;
    }


    /**
     * Gets the transaction_Code value for this IdentidadReservacionHuesped.
     * 
     * @return transaction_Code
     */
    public java.lang.String getTransaction_Code() {
        return transaction_Code;
    }


    /**
     * Sets the transaction_Code value for this IdentidadReservacionHuesped.
     * 
     * @param transaction_Code
     */
    public void setTransaction_Code(java.lang.String transaction_Code) {
        this.transaction_Code = transaction_Code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentidadReservacionHuesped)) return false;
        IdentidadReservacionHuesped other = (IdentidadReservacionHuesped) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.check_In==null && other.getCheck_In()==null) || 
             (this.check_In!=null &&
              this.check_In.equals(other.getCheck_In()))) &&
            ((this.check_Out==null && other.getCheck_Out()==null) || 
             (this.check_Out!=null &&
              this.check_Out.equals(other.getCheck_Out()))) &&
            ((this.estatusReservacion==null && other.getEstatusReservacion()==null) || 
             (this.estatusReservacion!=null &&
              this.estatusReservacion.equals(other.getEstatusReservacion()))) &&
            ((this.huespedApellidos==null && other.getHuespedApellidos()==null) || 
             (this.huespedApellidos!=null &&
              this.huespedApellidos.equals(other.getHuespedApellidos()))) &&
            ((this.huespedMaster==null && other.getHuespedMaster()==null) || 
             (this.huespedMaster!=null &&
              this.huespedMaster.equals(other.getHuespedMaster()))) &&
            ((this.huespedNombre==null && other.getHuespedNombre()==null) || 
             (this.huespedNombre!=null &&
              this.huespedNombre.equals(other.getHuespedNombre()))) &&
            ((this.noHabitacion==null && other.getNoHabitacion()==null) || 
             (this.noHabitacion!=null &&
              this.noHabitacion.equals(other.getNoHabitacion()))) &&
            ((this.reservacion_id==null && other.getReservacion_id()==null) || 
             (this.reservacion_id!=null &&
              this.reservacion_id.equals(other.getReservacion_id()))) &&
            ((this.transaction_Code==null && other.getTransaction_Code()==null) || 
             (this.transaction_Code!=null &&
              this.transaction_Code.equals(other.getTransaction_Code())));
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
        if (getCheck_In() != null) {
            _hashCode += getCheck_In().hashCode();
        }
        if (getCheck_Out() != null) {
            _hashCode += getCheck_Out().hashCode();
        }
        if (getEstatusReservacion() != null) {
            _hashCode += getEstatusReservacion().hashCode();
        }
        if (getHuespedApellidos() != null) {
            _hashCode += getHuespedApellidos().hashCode();
        }
        if (getHuespedMaster() != null) {
            _hashCode += getHuespedMaster().hashCode();
        }
        if (getHuespedNombre() != null) {
            _hashCode += getHuespedNombre().hashCode();
        }
        if (getNoHabitacion() != null) {
            _hashCode += getNoHabitacion().hashCode();
        }
        if (getReservacion_id() != null) {
            _hashCode += getReservacion_id().hashCode();
        }
        if (getTransaction_Code() != null) {
            _hashCode += getTransaction_Code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentidadReservacionHuesped.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "IdentidadReservacionHuesped"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_In");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Check_In"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_Out");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Check_Out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusReservacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "EstatusReservacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huespedApellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "HuespedApellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huespedMaster");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "HuespedMaster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huespedNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "HuespedNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noHabitacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "NoHabitacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservacion_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Reservacion_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Entidades", "Transaction_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
