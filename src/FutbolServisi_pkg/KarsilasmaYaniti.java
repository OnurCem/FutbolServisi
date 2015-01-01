/**
 * KarsilasmaYaniti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class KarsilasmaYaniti  implements java.io.Serializable {
    private boolean durum;

    private java.lang.String mesaj;

    private FutbolServisi_pkg.Karsilasma[] karsilasmalar;

    public KarsilasmaYaniti() {
    }

    public KarsilasmaYaniti(
           boolean durum,
           java.lang.String mesaj,
           FutbolServisi_pkg.Karsilasma[] karsilasmalar) {
           this.durum = durum;
           this.mesaj = mesaj;
           this.karsilasmalar = karsilasmalar;
    }


    /**
     * Gets the durum value for this KarsilasmaYaniti.
     * 
     * @return durum
     */
    public boolean isDurum() {
        return durum;
    }


    /**
     * Sets the durum value for this KarsilasmaYaniti.
     * 
     * @param durum
     */
    public void setDurum(boolean durum) {
        this.durum = durum;
    }


    /**
     * Gets the mesaj value for this KarsilasmaYaniti.
     * 
     * @return mesaj
     */
    public java.lang.String getMesaj() {
        return mesaj;
    }


    /**
     * Sets the mesaj value for this KarsilasmaYaniti.
     * 
     * @param mesaj
     */
    public void setMesaj(java.lang.String mesaj) {
        this.mesaj = mesaj;
    }


    /**
     * Gets the karsilasmalar value for this KarsilasmaYaniti.
     * 
     * @return karsilasmalar
     */
    public FutbolServisi_pkg.Karsilasma[] getKarsilasmalar() {
        return karsilasmalar;
    }


    /**
     * Sets the karsilasmalar value for this KarsilasmaYaniti.
     * 
     * @param karsilasmalar
     */
    public void setKarsilasmalar(FutbolServisi_pkg.Karsilasma[] karsilasmalar) {
        this.karsilasmalar = karsilasmalar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KarsilasmaYaniti)) return false;
        KarsilasmaYaniti other = (KarsilasmaYaniti) obj;
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
            ((this.karsilasmalar==null && other.getKarsilasmalar()==null) || 
             (this.karsilasmalar!=null &&
              java.util.Arrays.equals(this.karsilasmalar, other.getKarsilasmalar())));
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
        if (getKarsilasmalar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKarsilasmalar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKarsilasmalar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KarsilasmaYaniti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "KarsilasmaYaniti"));
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
        elemField.setFieldName("karsilasmalar");
        elemField.setXmlName(new javax.xml.namespace.QName("FutbolServisi", "karsilasmalar"));
        elemField.setXmlType(new javax.xml.namespace.QName("FutbolServisi", "Karsilasma"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("FutbolServisi", "karsilasma"));
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
