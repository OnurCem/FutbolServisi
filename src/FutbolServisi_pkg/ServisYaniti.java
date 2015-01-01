/**
 * ServisYaniti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class ServisYaniti  implements java.io.Serializable {
    private boolean durum;

    private java.lang.String mesaj;

    private java.lang.String veri;

    public ServisYaniti() {
    }

    public ServisYaniti(
           boolean durum,
           java.lang.String mesaj,
           java.lang.String veri) {
           this.durum = durum;
           this.mesaj = mesaj;
           this.veri = veri;
    }


    /**
     * Gets the durum value for this ServisYaniti.
     * 
     * @return durum
     */
    public boolean isDurum() {
        return durum;
    }


    /**
     * Sets the durum value for this ServisYaniti.
     * 
     * @param durum
     */
    public void setDurum(boolean durum) {
        this.durum = durum;
    }


    /**
     * Gets the mesaj value for this ServisYaniti.
     * 
     * @return mesaj
     */
    public java.lang.String getMesaj() {
        return mesaj;
    }


    /**
     * Sets the mesaj value for this ServisYaniti.
     * 
     * @param mesaj
     */
    public void setMesaj(java.lang.String mesaj) {
        this.mesaj = mesaj;
    }


    /**
     * Gets the veri value for this ServisYaniti.
     * 
     * @return veri
     */
    public java.lang.String getVeri() {
        return veri;
    }


    /**
     * Sets the veri value for this ServisYaniti.
     * 
     * @param veri
     */
    public void setVeri(java.lang.String veri) {
        this.veri = veri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServisYaniti)) return false;
        ServisYaniti other = (ServisYaniti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.durum == other.isDurum() &&
            ((this.mesaj==null && other.getMesaj()==null) || 
             (this.mesaj!=null &&
              this.mesaj.equals(other.getMesaj()))) &&
            ((this.veri==null && other.getVeri()==null) || 
             (this.veri!=null &&
              this.veri.equals(other.getVeri())));
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
        _hashCode += (isDurum() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMesaj() != null) {
            _hashCode += getMesaj().hashCode();
        }
        if (getVeri() != null) {
            _hashCode += getVeri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServisYaniti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "ServisYaniti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durum");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "Durum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesaj");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "Mesaj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veri");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "Veri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
