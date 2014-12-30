package deneme;

public class FutbolServisiProxy implements deneme.FutbolServisi_PortType {
  private String _endpoint = null;
  private deneme.FutbolServisi_PortType futbolServisi_PortType = null;
  
  public FutbolServisiProxy() {
    _initFutbolServisiProxy();
  }
  
  public FutbolServisiProxy(String endpoint) {
    _endpoint = endpoint;
    _initFutbolServisiProxy();
  }
  
  private void _initFutbolServisiProxy() {
    try {
      futbolServisi_PortType = (new deneme.FutbolServisi_ServiceLocator()).getFutbolServisiSOAP();
      if (futbolServisi_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)futbolServisi_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)futbolServisi_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (futbolServisi_PortType != null)
      ((javax.xml.rpc.Stub)futbolServisi_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public deneme.FutbolServisi_PortType getFutbolServisi_PortType() {
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType;
  }
  
  public KarsilasmaDizisi karsilasmaBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException{
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType.karsilasmaBilgisiGetir(takimNumarasi);
  }
  
  public boolean takimKaydet(int takimNo, java.lang.String takimAdi, deneme.FutbolcuTipi[] futbolcular) throws java.rmi.RemoteException{
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType.takimKaydet(takimNo, takimAdi, futbolcular);
  }
  
  public boolean karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException{
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType.karsilasmaKaydet(haftaNo, evSahibiTakimNo, misafirTakimNo, evSahibiGolSayisi, misafirGolSayisi);
  }
  
  public boolean golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException{
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType.golSayisiKaydet(haftaNo, takimNo, formaNo, golSayisi);
  }
  
  public deneme.TakimTipi takimBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException{
    if (futbolServisi_PortType == null)
      _initFutbolServisiProxy();
    return futbolServisi_PortType.takimBilgisiGetir(takimNumarasi);
  }
  
  
}