/**
 * FutbolServisiSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package deneme;

public class FutbolServisiSOAPSkeleton implements deneme.FutbolServisi_PortType, org.apache.axis.wsdl.Skeleton {
    private deneme.FutbolServisi_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNumarasi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("karsilasmaBilgisiGetir", _params, new javax.xml.namespace.QName("", "KarsilasmaBilgisi"));
        _oper.setReturnType(new javax.xml.namespace.QName("deneme", "KarsilasmaDizisi"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "KarsilasmaBilgisiGetir"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/KarsilasmaBilgisiGetir");
        _myOperationsList.add(_oper);
        if (_myOperations.get("karsilasmaBilgisiGetir") == null) {
            _myOperations.put("karsilasmaBilgisiGetir", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("karsilasmaBilgisiGetir")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimAdi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Futbolcular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("deneme", "FutbolcuDizisi"), deneme.FutbolcuTipi[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("takimKaydet", _params, new javax.xml.namespace.QName("", "TakimKayitBilgisi"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "TakimKaydet"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/TakimKaydet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("takimKaydet") == null) {
            _myOperations.put("takimKaydet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("takimKaydet")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HaftaNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EvSahibiTakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "MisafirTakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EvSahibiGolSayisi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "MisafirGolSayisi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("karsilasmaKaydet", _params, new javax.xml.namespace.QName("", "KarsilasmaKayitBilgisi"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "KarsilasmaKaydet"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/KarsilasmaKaydet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("karsilasmaKaydet") == null) {
            _myOperations.put("karsilasmaKaydet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("karsilasmaKaydet")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HaftaNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FormaNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GolSayisi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("golSayisiKaydet", _params, new javax.xml.namespace.QName("", "KarsilasmaKayitBilgisi"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GolSayisiKaydet"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/GolSayisiKaydet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("golSayisiKaydet") == null) {
            _myOperations.put("golSayisiKaydet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("golSayisiKaydet")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNumarasi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("takimBilgisiGetir", _params, new javax.xml.namespace.QName("", "TakimBilgisi"));
        _oper.setReturnType(new javax.xml.namespace.QName("deneme", "TakimTipi"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "TakimBilgisiGetir"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/TakimBilgisiGetir");
        _myOperationsList.add(_oper);
        if (_myOperations.get("takimBilgisiGetir") == null) {
            _myOperations.put("takimBilgisiGetir", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("takimBilgisiGetir")).add(_oper);
    }

    public FutbolServisiSOAPSkeleton() {
        this.impl = new deneme.FutbolServisiSOAPImpl();
    }

    public FutbolServisiSOAPSkeleton(deneme.FutbolServisi_PortType impl) {
        this.impl = impl;
    }
    public KarsilasmaDizisi karsilasmaBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException
    {
        KarsilasmaDizisi ret = impl.karsilasmaBilgisiGetir(takimNumarasi);
        return ret;
    }

    public boolean takimKaydet(int takimNo, java.lang.String takimAdi, deneme.FutbolcuTipi[] futbolcular) throws java.rmi.RemoteException
    {
        boolean ret = impl.takimKaydet(takimNo, takimAdi, futbolcular);
        return ret;
    }

    public boolean karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException
    {
        boolean ret = impl.karsilasmaKaydet(haftaNo, evSahibiTakimNo, misafirTakimNo, evSahibiGolSayisi, misafirGolSayisi);
        return ret;
    }

    public boolean golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException
    {
        boolean ret = impl.golSayisiKaydet(haftaNo, takimNo, formaNo, golSayisi);
        return ret;
    }

    public deneme.TakimTipi takimBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException
    {
        deneme.TakimTipi ret = impl.takimBilgisiGetir(takimNumarasi);
        return ret;
    }

}
