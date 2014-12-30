/**
 * TakimTipi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package deneme;

public class TakimTipi  implements java.io.Serializable {
    private java.lang.String takimAdi;

    private int takimKodu;

    private int galibiyetSayisi;

    private int beraberlikSayisi;

    private int maglubiyetSayisi;

    private int attigiGolSayisi;

    private int yedigiGolSayisi;

    private deneme.FutbolcuTipi[] futbolcular;

    public TakimTipi() {
    }

    public TakimTipi(
           java.lang.String takimAdi,
           int takimKodu,
           int galibiyetSayisi,
           int beraberlikSayisi,
           int maglubiyetSayisi,
           int attigiGolSayisi,
           int yedigiGolSayisi,
           deneme.FutbolcuTipi[] futbolcular) {
           this.takimAdi = takimAdi;
           this.takimKodu = takimKodu;
           this.galibiyetSayisi = galibiyetSayisi;
           this.beraberlikSayisi = beraberlikSayisi;
           this.maglubiyetSayisi = maglubiyetSayisi;
           this.attigiGolSayisi = attigiGolSayisi;
           this.yedigiGolSayisi = yedigiGolSayisi;
           this.futbolcular = futbolcular;
    }
    
    public void golSayisiGuncelle(int attigiGolSayisi, int yedigiGolSayisi) {
    	this.attigiGolSayisi += attigiGolSayisi;
    	this.yedigiGolSayisi += yedigiGolSayisi;
    	if (attigiGolSayisi > yedigiGolSayisi) {
    		galibiyetSayisi++;
    	} else if (attigiGolSayisi < yedigiGolSayisi) {
    		maglubiyetSayisi++;
    	} else {
    		beraberlikSayisi++;
    	}
    }


    /**
     * Gets the takimAdi value for this TakimTipi.
     * 
     * @return takimAdi
     */
    public java.lang.String getTakimAdi() {
        return takimAdi;
    }


    /**
     * Sets the takimAdi value for this TakimTipi.
     * 
     * @param takimAdi
     */
    public void setTakimAdi(java.lang.String takimAdi) {
        this.takimAdi = takimAdi;
    }


    /**
     * Gets the takimKodu value for this TakimTipi.
     * 
     * @return takimKodu
     */
    public int getTakimKodu() {
        return takimKodu;
    }


    /**
     * Sets the takimKodu value for this TakimTipi.
     * 
     * @param takimKodu
     */
    public void setTakimKodu(int takimKodu) {
        this.takimKodu = takimKodu;
    }


    /**
     * Gets the galibiyetSayisi value for this TakimTipi.
     * 
     * @return galibiyetSayisi
     */
    public int getGalibiyetSayisi() {
        return galibiyetSayisi;
    }


    /**
     * Sets the galibiyetSayisi value for this TakimTipi.
     * 
     * @param galibiyetSayisi
     */
    public void setGalibiyetSayisi(int galibiyetSayisi) {
        this.galibiyetSayisi = galibiyetSayisi;
    }


    /**
     * Gets the beraberlikSayisi value for this TakimTipi.
     * 
     * @return beraberlikSayisi
     */
    public int getBeraberlikSayisi() {
        return beraberlikSayisi;
    }


    /**
     * Sets the beraberlikSayisi value for this TakimTipi.
     * 
     * @param beraberlikSayisi
     */
    public void setBeraberlikSayisi(int beraberlikSayisi) {
        this.beraberlikSayisi = beraberlikSayisi;
    }


    /**
     * Gets the maglubiyetSayisi value for this TakimTipi.
     * 
     * @return maglubiyetSayisi
     */
    public int getMaglubiyetSayisi() {
        return maglubiyetSayisi;
    }


    /**
     * Sets the maglubiyetSayisi value for this TakimTipi.
     * 
     * @param maglubiyetSayisi
     */
    public void setMaglubiyetSayisi(int maglubiyetSayisi) {
        this.maglubiyetSayisi = maglubiyetSayisi;
    }


    /**
     * Gets the attigiGolSayisi value for this TakimTipi.
     * 
     * @return attigiGolSayisi
     */
    public int getAttigiGolSayisi() {
        return attigiGolSayisi;
    }


    /**
     * Sets the attigiGolSayisi value for this TakimTipi.
     * 
     * @param attigiGolSayisi
     */
    public void setAttigiGolSayisi(int attigiGolSayisi) {
        this.attigiGolSayisi = attigiGolSayisi;
    }


    /**
     * Gets the yedigiGolSayisi value for this TakimTipi.
     * 
     * @return yedigiGolSayisi
     */
    public int getYedigiGolSayisi() {
        return yedigiGolSayisi;
    }


    /**
     * Sets the yedigiGolSayisi value for this TakimTipi.
     * 
     * @param yedigiGolSayisi
     */
    public void setYedigiGolSayisi(int yedigiGolSayisi) {
        this.yedigiGolSayisi = yedigiGolSayisi;
    }


    /**
     * Gets the futbolcular value for this TakimTipi.
     * 
     * @return futbolcular
     */
    public deneme.FutbolcuTipi[] getFutbolcular() {
        return futbolcular;
    }


    /**
     * Sets the futbolcular value for this TakimTipi.
     * 
     * @param futbolcular
     */
    public void setFutbolcular(deneme.FutbolcuTipi[] futbolcular) {
        this.futbolcular = futbolcular;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TakimTipi)) return false;
        TakimTipi other = (TakimTipi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.takimAdi==null && other.getTakimAdi()==null) || 
             (this.takimAdi!=null &&
              this.takimAdi.equals(other.getTakimAdi()))) &&
            this.takimKodu == other.getTakimKodu() &&
            this.galibiyetSayisi == other.getGalibiyetSayisi() &&
            this.beraberlikSayisi == other.getBeraberlikSayisi() &&
            this.maglubiyetSayisi == other.getMaglubiyetSayisi() &&
            this.attigiGolSayisi == other.getAttigiGolSayisi() &&
            this.yedigiGolSayisi == other.getYedigiGolSayisi() &&
            ((this.futbolcular==null && other.getFutbolcular()==null) || 
             (this.futbolcular!=null &&
              java.util.Arrays.equals(this.futbolcular, other.getFutbolcular())));
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
        if (getTakimAdi() != null) {
            _hashCode += getTakimAdi().hashCode();
        }
        _hashCode += getTakimKodu();
        _hashCode += getGalibiyetSayisi();
        _hashCode += getBeraberlikSayisi();
        _hashCode += getMaglubiyetSayisi();
        _hashCode += getAttigiGolSayisi();
        _hashCode += getYedigiGolSayisi();
        if (getFutbolcular() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFutbolcular());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFutbolcular(), i);
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
        new org.apache.axis.description.TypeDesc(TakimTipi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("deneme", "TakimTipi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takimAdi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "TakimAdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takimKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "TakimKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("galibiyetSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "GalibiyetSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beraberlikSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "BeraberlikSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maglubiyetSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "MaglubiyetSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attigiGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "AttigiGolSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yedigiGolSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "YedigiGolSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futbolcular");
        elemField.setXmlName(new javax.xml.namespace.QName("deneme", "Futbolcular"));
        elemField.setXmlType(new javax.xml.namespace.QName("deneme", "FutbolcuTipi"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("deneme", "Futbolcu"));
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
