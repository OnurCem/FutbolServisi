/**
 * FutbolServisiSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 * 
 * @author onurcemsenelgmail.com
 */



package FutbolServisi_pkg;


/**
 * Class to store all methods for service 
 * @author onurcemsenel@gmail.com
 *
 */
public class FutbolServisiSOAPImpl implements FutbolServisi_pkg.FutbolServisi_PortType{
	private static DataStore ds;
	
	public FutbolServisiSOAPImpl() {
		ds = DataStore.getInstance();
	}
	
	public FutbolServisi_pkg.KarsilasmaYaniti karsilasmaGetir(int takimNo) throws java.rmi.RemoteException {
		FileLogger.writeDateTime();
    	FileLogger.write(FileLogger.INFO, "Karsilasma Getir");
		
		KarsilasmaYaniti yanit = new KarsilasmaYaniti();
		Karsilasma[] karsilasmalar = ds.karsilasmaBul(takimNo);
		
		if (karsilasmalar.length == 0) {
			yanit.setDurum(false);
			yanit.setMesaj(takimNo + " numarali takim icin karsilasma bulunamadi");
			FileLogger.write(FileLogger.ERROR, yanit.getMesaj());
		} else {
			yanit.setDurum(true);
			yanit.setMesaj(takimNo + " numarali takim icin " + karsilasmalar.length + " karsilasma bulundu");
			FileLogger.write(FileLogger.INFO, yanit.getMesaj());
		}

		yanit.setKarsilasmalar(karsilasmalar);
		return yanit;
    }

    public FutbolServisi_pkg.ServisYaniti takimKaydet(int takimNo, java.lang.String takimAdi, FutbolServisi_pkg.Futbolcu[] futbolcular) throws java.rmi.RemoteException {
    	FileLogger.writeDateTime();
    	FileLogger.write(FileLogger.INFO, "Takim Kaydet");
    	
    	ServisYaniti yanit = new ServisYaniti();
    	yanit.setVeri("Takim no: " + takimNo + " Takim adi: " + takimAdi);
    	
    	if (ds.takimEkle(takimNo, takimAdi, futbolcular)) {
    		ds.tumVerileriListele();
    		yanit.setDurum(true);
    		yanit.setMesaj(takimAdi + " takimi eklendi");
    		FileLogger.write(FileLogger.INFO, yanit.getMesaj());
    	} else {
    		yanit.setDurum(false);
    		yanit.setMesaj(ds.getErrorMessage());
    		FileLogger.write(FileLogger.ERROR, yanit.getMesaj());
    	}
    	return yanit;
    }

    public FutbolServisi_pkg.ServisYaniti karsilasmaKaydet(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) throws java.rmi.RemoteException {
    	FileLogger.writeDateTime();
    	FileLogger.write(FileLogger.INFO, "Karsilasma Kaydet");
    	
    	ServisYaniti yanit = new ServisYaniti();
    	yanit.setVeri("Hafta no: " + haftaNo);
    	
    	if (ds.karsilasmaEkle(haftaNo, evSahibiTakimNo, misafirTakimNo, evSahibiGolSayisi, misafirGolSayisi)) {
    		ds.tumVerileriListele();
    		yanit.setDurum(true);
    		yanit.setMesaj(haftaNo + ". hafta karsilasmasi eklendi");
    		FileLogger.write(FileLogger.INFO, yanit.getMesaj());
    	} else {
    		yanit.setDurum(false);
    		yanit.setMesaj(ds.getErrorMessage());
    		FileLogger.write(FileLogger.ERROR, yanit.getMesaj());
    	}
    	return yanit;
    }

    public FutbolServisi_pkg.ServisYaniti golSayisiKaydet(int haftaNo, int takimNo, int formaNo, int golSayisi) throws java.rmi.RemoteException {
    	FileLogger.writeDateTime();
    	FileLogger.write(FileLogger.INFO, "Gol Sayisi Kaydet");
    	
    	ServisYaniti yanit = new ServisYaniti();
    	yanit.setVeri("Forma no: " + formaNo);
    	
    	if (ds.golSayisiEkle(haftaNo, takimNo, formaNo, golSayisi)) {
    		yanit.setDurum(true);
    		yanit.setMesaj(formaNo + " forma numarali futbolcunun gol sayisi guncellendi");
    		FileLogger.write(FileLogger.INFO, yanit.getMesaj());
    	} else {
    		yanit.setDurum(false);
    		yanit.setMesaj(ds.getErrorMessage());
    		FileLogger.write(FileLogger.ERROR, yanit.getMesaj());
    	}
    	return yanit;
    }

    public FutbolServisi_pkg.TakimYaniti takimGetir(int takimNo) throws java.rmi.RemoteException {
    	FileLogger.writeDateTime();
    	FileLogger.write(FileLogger.INFO, "Takim Getir");
    	
    	TakimYaniti yanit = new TakimYaniti();
    	Takim takim = ds.takimBul(takimNo);
    	
    	if (takim != null) {
    		yanit.setDurum(true);
    		yanit.setMesaj(takimNo + " numarali takim bulundu");
    		yanit.setTakim(takim);
    		FileLogger.write(FileLogger.INFO, yanit.getMesaj());
    	} else {
    		yanit.setDurum(false);
    		yanit.setMesaj("Takim bulunamadi: " + takimNo);
    		FileLogger.write(FileLogger.ERROR, yanit.getMesaj());
    	}
    	
    	return yanit;
    }

}
