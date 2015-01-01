/**
 * Karsilasma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class Karsilasma  implements java.io.Serializable {
    private int haftaNo;

    private FutbolServisi_pkg.Takim evSahibiTakim;

    private FutbolServisi_pkg.Takim misafirTakim;

    private int evSahibiTakimGolSayisi;

    private int misafirTakimGolSayisi;

    public Karsilasma() {
    }

    public Karsilasma(
           int haftaNo,
           FutbolServisi_pkg.Takim evSahibiTakim,
           FutbolServisi_pkg.Takim misafirTakim,
           int evSahibiTakimGolSayisi,
           int misafirTakimGolSayisi) {
           this.haftaNo = haftaNo;
           this.evSahibiTakim = evSahibiTakim;
           this.misafirTakim = misafirTakim;
           this.evSahibiTakimGolSayisi = evSahibiTakimGolSayisi;
           this.misafirTakimGolSayisi = misafirTakimGolSayisi;
    }


    /**
     * Gets the haftaNo value for this Karsilasma.
     * 
     * @return haftaNo
     */
    public int getHaftaNo() {
        return haftaNo;
    }


    /**
     * Sets the haftaNo value for this Karsilasma.
     * 
     * @param haftaNo
     */
    public void setHaftaNo(int haftaNo) {
        this.haftaNo = haftaNo;
    }


    /**
     * Gets the evSahibiTakim value for this Karsilasma.
     * 
     * @return evSahibiTakim
     */
    public FutbolServisi_pkg.Takim getEvSahibiTakim() {
        return evSahibiTakim;
    }


    /**
     * Sets the evSahibiTakim value for this Karsilasma.
     * 
     * @param evSahibiTakim
     */
    public void setEvSahibiTakim(FutbolServisi_pkg.Takim evSahibiTakim) {
        this.evSahibiTakim = evSahibiTakim;
    }


    /**
     * Gets the misafirTakim value for this Karsilasma.
     * 
     * @return misafirTakim
     */
    public FutbolServisi_pkg.Takim getMisafirTakim() {
        return misafirTakim;
    }


    /**
     * Sets the misafirTakim value for this Karsilasma.
     * 
     * @param misafirTakim
     */
    public void setMisafirTakim(FutbolServisi_pkg.Takim misafirTakim) {
        this.misafirTakim = misafirTakim;
    }


    /**
     * Gets the evSahibiTakimGolSayisi value for this Karsilasma.
     * 
     * @return evSahibiTakimGolSayisi
     */
    public int getEvSahibiTakimGolSayisi() {
        return evSahibiTakimGolSayisi;
    }


    /**
     * Sets the evSahibiTakimGolSayisi value for this Karsilasma.
     * 
     * @param evSahibiTakimGolSayisi
     */
    public void setEvSahibiTakimGolSayisi(int evSahibiTakimGolSayisi) {
        this.evSahibiTakimGolSayisi = evSahibiTakimGolSayisi;
    }


    /**
     * Gets the misafirTakimGolSayisi value for this Karsilasma.
     * 
     * @return misafirTakimGolSayisi
     */
    public int getMisafirTakimGolSayisi() {
        return misafirTakimGolSayisi;
    }


    /**
     * Sets the misafirTakimGolSayisi value for this Karsilasma.
     * 
     * @param misafirTakimGolSayisi
     */
    public void setMisafirTakimGolSayisi(int misafirTakimGolSayisi) {
        this.misafirTakimGolSayisi = misafirTakimGolSayisi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Karsilasma)) return false;
        Karsilasma other = (Karsilasma) obj;
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
        new org.apache.axis.description.TypeDesc(Karsilasma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Karsilasma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haftaNo");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "haftaNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evSahibiTakim");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "evSahibiTakim"));
        elemField.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Takim"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misafirTakim");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "misafirTakim"));
        elemField.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Takim"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evSahibiTakimGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "evSahibiTakimGolSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misafirTakimGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "misafirTakimGolSayisi"));
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
