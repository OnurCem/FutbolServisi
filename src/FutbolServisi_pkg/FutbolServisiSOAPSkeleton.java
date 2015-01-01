/**
 * FutbolServisiSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class FutbolServisiSOAPSkeleton implements FutbolServisi_pkg.FutbolServisi_PortType, org.apache.axis.wsdl.Skeleton {
    private FutbolServisi_pkg.FutbolServisi_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("karsilasmaGetir", _params, new javax.xml.namespace.QName("", "KarsilasmaGetirYaniti"));
        _oper.setReturnType(new javax.xml.namespace.QName("FutbolServisi", "KarsilasmaYaniti"));
        _oper.setElementQName(new javax.xml.namespace.QName("FutbolServisi", "KarsilasmaGetir"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/KarsilasmaGetir");
        _myOperationsList.add(_oper);
        if (_myOperations.get("karsilasmaGetir") == null) {
            _myOperations.put("karsilasmaGetir", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("karsilasmaGetir")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimAdi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Futbolcular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("FutbolServisi", "Futbolcular"), FutbolServisi_pkg.Futbolcu[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("takimKaydet", _params, new javax.xml.namespace.QName("", "TakimKaydetYaniti"));
        _oper.setReturnType(new javax.xml.namespace.QName("FutbolServisi", "ServisYaniti"));
        _oper.setElementQName(new javax.xml.namespace.QName("FutbolServisi", "TakimKaydet"));
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
        _oper = new org.apache.axis.description.OperationDesc("karsilasmaKaydet", _params, new javax.xml.namespace.QName("", "KarsilasmaKaydetYaniti"));
        _oper.setReturnType(new javax.xml.namespace.QName("FutbolServisi", "ServisYaniti"));
        _oper.setElementQName(new javax.xml.namespace.QName("FutbolServisi", "KarsilasmaKaydet"));
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
        _oper = new org.apache.axis.description.OperationDesc("golSayisiKaydet", _params, new javax.xml.namespace.QName("", "GolSayisiKaydetYaniti"));
        _oper.setReturnType(new javax.xml.namespace.QName("FutbolServisi", "ServisYaniti"));
        _oper.setElementQName(new javax.xml.namespace.QName("FutbolServisi", "GolSayisiKaydet"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/GolSayisiKaydet");
        _myOperationsList.add(_oper);
        if (_myOperations.get("golSayisiKaydet") == null) {
            _myOperations.put("golSayisiKaydet", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("golSayisiKaydet")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TakimNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("takimGetir", _params, new javax.xml.namespace.QName("", "TakimGetirYaniti"));
        _oper.setReturnType(new javax.xml.namespace.QName("FutbolServisi", "TakimYaniti"));
        _oper.setElementQName(new javax.xml.namespace.QName("FutbolServisi", "TakimGetir"));
        _oper.setSoapAction("http://tempuri.org/FutbolServisi/TakimGetir");
        _myOperationsList.add(_oper);
        if (_myOperations.get("takimGetir") == null) {
            _myOperations.put("takimGetir", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("takimGetir")).add(_oper);
    }

    public FutbolServisiSOAPSkeleton() {
        this.impl = new FutbolServisi_pkg.FutbolServisiSOAPImpl();
    }

    public FutbolServisiSOAPSkeleton(FutbolServisi_pkg.FutbolServisi_PortType impl) {
        this.impl = impl;
    }
    public FutbolServisi_pkg.KarsilasmaYaniti karsilasmaGetir(int takimNo) throws java.rmi.RemoteException
    {
        FutbolServisi_pkg.KarsilasmaYaniti ret = impl.karsilasmaGetir(takimNo);
        return ret;
    }

    public FutbolServisi_pkg.ServisYaniti takimKaydet(int takimNo, java.lang.String takimAdi, FutbolServisi_pkg.Futbolcu[] futbolcular) throws java.rmi.RemoteException
    {
        FutbolServisi_pkg.ServisYaniti ret = impl.takimKaydet(takimNo, takimAdi, futbolcular);
        return ret;
    }

    public FutbolServisi_pkg.ServisYaniti karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException
    {
        FutbolServisi_pkg.ServisYaniti ret = impl.karsilasmaKaydet(haftaNo, evSahibiTakimNo, misafirTakimNo, evSahibiGolSayisi, misafirGolSayisi);
        return ret;
    }

    public FutbolServisi_pkg.ServisYaniti golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException
    {
        FutbolServisi_pkg.ServisYaniti ret = impl.golSayisiKaydet(haftaNo, takimNo, formaNo, golSayisi);
        return ret;
    }

    public FutbolServisi_pkg.TakimYaniti takimGetir(int takimNo) throws java.rmi.RemoteException
    {
        FutbolServisi_pkg.TakimYaniti ret = impl.takimGetir(takimNo);
        return ret;
    }

}
