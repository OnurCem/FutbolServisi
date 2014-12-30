/**
 * FutbolServisiSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package deneme;

public class FutbolServisiSOAPImpl implements deneme.FutbolServisi_PortType{
	private static DataStore ds;
	
	public FutbolServisiSOAPImpl() {
		ds = DataStore.getInstance();
	}
	
	public KarsilasmaDizisi karsilasmaBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException {
		return ds.karsilasmaBul(takimNumarasi);
    }

    public boolean takimKaydet(int takimNo, java.lang.String takimAdi, deneme.FutbolcuTipi[] futbolcular) throws java.rmi.RemoteException {
    	boolean status = ds.takimEkle(takimNo, takimAdi, futbolcular);
    	ds.tumVerileriListele();
    	return status;
    }

    public boolean karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException {
    	boolean status = ds.karsilasmaEkle(haftaNo, evSahibiTakimNo, misafirTakimNo, evSahibiGolSayisi, misafirGolSayisi);
    	ds.tumVerileriListele();
    	return status;
    }

    public boolean golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException {
    	boolean status = ds.golSayisiEkle(haftaNo, takimNo, formaNo, golSayisi);
    	return status;
    }

    public deneme.TakimTipi takimBilgisiGetir(int takimNumarasi) throws java.rmi.RemoteException {
    	return ds.takimBul(takimNumarasi);
    }
}
