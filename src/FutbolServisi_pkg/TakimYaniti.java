/**
 * TakimYaniti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class TakimYaniti  implements java.io.Serializable {
    private boolean durum;

    private java.lang.String mesaj;

    private FutbolServisi_pkg.Takim takim;

    public TakimYaniti() {
    }

    public TakimYaniti(
           boolean durum,
           java.lang.String mesaj,
           FutbolServisi_pkg.Takim takim) {
           this.durum = durum;
           this.mesaj = mesaj;
           this.takim = takim;
    }


    /**
     * Gets the durum value for this TakimYaniti.
     * 
     * @return durum
     */
    public boolean isDurum() {
        return durum;
    }


    /**
     * Sets the durum value for this TakimYaniti.
     * 
     * @param durum
     */
    public void setDurum(boolean durum) {
        this.durum = durum;
    }


    /**
     * Gets the mesaj value for this TakimYaniti.
     * 
     * @return mesaj
     */
    public java.lang.String getMesaj() {
        return mesaj;
    }


    /**
     * Sets the mesaj value for this TakimYaniti.
     * 
     * @param mesaj
     */
    public void setMesaj(java.lang.String mesaj) {
        this.mesaj = mesaj;
    }


    /**
     * Gets the takim value for this TakimYaniti.
     * 
     * @return takim
     */
    public FutbolServisi_pkg.Takim getTakim() {
        return takim;
    }


    /**
     * Sets the takim value for this TakimYaniti.
     * 
     * @param takim
     */
    public void setTakim(FutbolServisi_pkg.Takim takim) {
        this.takim = takim;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TakimYaniti)) return false;
        TakimYaniti other = (TakimYaniti) obj;
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
            ((this.takim==null && other.getTakim()==null) || 
             (this.takim!=null &&
              this.takim.equals(other.getTakim())));
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
        if (getTakim() != null) {
            _hashCode += getTakim().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TakimYaniti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "TakimYaniti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durum");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "durum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesaj");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "mesaj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takim");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "takim"));
        elemField.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Takim"));
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
