/**
 * Futbolcu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class Futbolcu  implements java.io.Serializable {
    private java.lang.String adSoyad;

    private int takimKodu;

    private int formaNumarasi;

    private int attigiGolSayisi;

    public Futbolcu() {
    }

    public Futbolcu(
           java.lang.String adSoyad,
           int takimKodu,
           int formaNumarasi,
           int attigiGolSayisi) {
           this.adSoyad = adSoyad;
           this.takimKodu = takimKodu;
           this.formaNumarasi = formaNumarasi;
           this.attigiGolSayisi = attigiGolSayisi;
    }

    public void golSayisiGuncelle(int golSayisi) {
    	this.attigiGolSayisi += golSayisi;
    }

    /**
     * Gets the adSoyad value for this Futbolcu.
     * 
     * @return adSoyad
     */
    public java.lang.String getAdSoyad() {
        return adSoyad;
    }


    /**
     * Sets the adSoyad value for this Futbolcu.
     * 
     * @param adSoyad
     */
    public void setAdSoyad(java.lang.String adSoyad) {
        this.adSoyad = adSoyad;
    }


    /**
     * Gets the takimKodu value for this Futbolcu.
     * 
     * @return takimKodu
     */
    public int getTakimKodu() {
        return takimKodu;
    }


    /**
     * Sets the takimKodu value for this Futbolcu.
     * 
     * @param takimKodu
     */
    public void setTakimKodu(int takimKodu) {
        this.takimKodu = takimKodu;
    }


    /**
     * Gets the formaNumarasi value for this Futbolcu.
     * 
     * @return formaNumarasi
     */
    public int getFormaNumarasi() {
        return formaNumarasi;
    }


    /**
     * Sets the formaNumarasi value for this Futbolcu.
     * 
     * @param formaNumarasi
     */
    public void setFormaNumarasi(int formaNumarasi) {
        this.formaNumarasi = formaNumarasi;
    }


    /**
     * Gets the attigiGolSayisi value for this Futbolcu.
     * 
     * @return attigiGolSayisi
     */
    public int getAttigiGolSayisi() {
        return attigiGolSayisi;
    }


    /**
     * Sets the attigiGolSayisi value for this Futbolcu.
     * 
     * @param attigiGolSayisi
     */
    public void setAttigiGolSayisi(int attigiGolSayisi) {
        this.attigiGolSayisi = attigiGolSayisi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Futbolcu)) return false;
        Futbolcu other = (Futbolcu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adSoyad==null && other.getAdSoyad()==null) || 
             (this.adSoyad!=null &&
              this.adSoyad.equals(other.getAdSoyad()))) &&
            this.takimKodu == other.getTakimKodu() &&
            this.formaNumarasi == other.getFormaNumarasi() &&
            this.attigiGolSayisi == other.getAttigiGolSayisi();
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
        if (getAdSoyad() != null) {
            _hashCode += getAdSoyad().hashCode();
        }
        _hashCode += getTakimKodu();
        _hashCode += getFormaNumarasi();
        _hashCode += getAttigiGolSayisi();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Futbolcu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Futbolcu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSoyad");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "adSoyad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takimKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "takimKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaNumarasi");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "formaNumarasi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attigiGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "attigiGolSayisi"));
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
