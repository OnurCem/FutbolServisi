/**
 * KarsilasmaTipi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package deneme;

public class KarsilasmaTipi  implements java.io.Serializable {
    private int haftaNo;

    private deneme.TakimTipi evSahibiTakim;

    private deneme.TakimTipi misafirTakim;

    private int evSahibiTakimGolSayisi;

    private int misafirTakimGolSayisi;

    public KarsilasmaTipi() {
    }

    public KarsilasmaTipi(
           int haftaNo,
           deneme.TakimTipi evSahibiTakim,
           deneme.TakimTipi misafirTakim,
           int evSahibiTakimGolSayisi,
           int misafirTakimGolSayisi) {
           this.haftaNo = haftaNo;
           this.evSahibiTakim = evSahibiTakim;
           this.misafirTakim = misafirTakim;
           this.evSahibiTakimGolSayisi = evSahibiTakimGolSayisi;
           this.misafirTakimGolSayisi = misafirTakimGolSayisi;
    }


    /**
     * Gets the haftaNo value for this KarsilasmaTipi.
     * 
     * @return haftaNo
     */
    public int getHaftaNo() {
        return haftaNo;
    }


    /**
     * Sets the haftaNo value for this KarsilasmaTipi.
     * 
     * @param haftaNo
     */
    public void setHaftaNo(int haftaNo) {
        this.haftaNo = haftaNo;
    }


    /**
     * Gets the evSahibiTakim value for this KarsilasmaTipi.
     * 
     * @return evSahibiTakim
     */
    public deneme.TakimTipi getEvSahibiTakim() {
        return evSahibiTakim;
    }


    /**
     * Sets the evSahibiTakim value for this KarsilasmaTipi.
     * 
     * @param evSahibiTakim
     */
    public void setEvSahibiTakim(deneme.TakimTipi evSahibiTakim) {
        this.evSahibiTakim = evSahibiTakim;
    }


    /**
     * Gets the misafirTakim value for this KarsilasmaTipi.
     * 
     * @return misafirTakim
     */
    public deneme.TakimTipi getMisafirTakim() {
        return misafirTakim;
    }


    /**
     * Sets the misafirTakim value for this KarsilasmaTipi.
     * 
     * @param misafirTakim
     */
    public void setMisafirTakim(deneme.TakimTipi misafirTakim) {
        this.misafirTakim = misafirTakim;
    }


    /**
     * Gets the evSahibiTakimGolSayisi value for this KarsilasmaTipi.
     * 
     * @return evSahibiTakimGolSayisi
     */
    public int getEvSahibiTakimGolSayisi() {
        return evSahibiTakimGolSayisi;
    }


    /**
     * Sets the evSahibiTakimGolSayisi value for this KarsilasmaTipi.
     * 
     * @param evSahibiTakimGolSayisi
     */
    public void setEvSahibiTakimGolSayisi(int evSahibiTakimGolSayisi) {
        this.evSahibiTakimGolSayisi = evSahibiTakimGolSayisi;
    }


    /**
     * Gets the misafirTakimGolSayisi value for this KarsilasmaTipi.
     * 
     * @return misafirTakimGolSayisi
     */
    public int getMisafirTakimGolSayisi() {
        return misafirTakimGolSayisi;
    }


    /**
     * Sets the misafirTakimGolSayisi value for this KarsilasmaTipi.
     * 
     * @param misafirTakimGolSayisi
     */
    public void setMisafirTakimGolSayisi(int misafirTakimGolSayisi) {
        this.misafirTakimGolSayisi = misafirTakimGolSayisi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KarsilasmaTipi)) return false;
        KarsilasmaTipi other = (KarsilasmaTipi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.haftaNo == other.getHaftaNo() &&
            ((this.evSahibiTakim==null && other.getEvSahibiTakim()==null) || 
             (this.evSahibiTakim!=null &&
              this.evSahibiTakim.equals(other.getEvSahibiTakim()))) &&
            ((this.misafirTakim==null && other.getMisafirTakim()==null) || 
             (this.misafirTakim!=null &&
              this.misafirTakim.equals(other.getMisafirTakim()))) &&
            this.evSahibiTakimGolSayisi == other.getEvSahibiTakimGolSayisi() &&
            this.misafirTakimGolSayisi == other.getMisafirTakimGolSayisi();
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
        _hashCode += getHaftaNo();
        if (getEvSahibiTakim() != null) {
            _hashCode += getEvSahibiTakim().hashCode();
        }
        if (getMisafirTakim() != null) {
            _hashCode += getMisafirTakim().hashCode();
        }
        _hashCode += getEvSahibiTakimGolSayisi();
        _hashCode += getMisafirTakimGolSayisi();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KarsilasmaTipi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("deneme", "KarsilasmaTipi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haftaNo");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "HaftaNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evSahibiTakim");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "EvSahibiTakim"));
        elemField.setXmlType(new javax.xml.namespace.QName("deneme", "TakimTipi"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misafirTakim");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "MisafirTakim"));
        elemField.setXmlType(new javax.xml.namespace.QName("deneme", "TakimTipi"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evSahibiTakimGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "EvSahibiTakimGolSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misafirTakimGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "MisafirTakimGolSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
