package FutbolServisi_pkg;

import java.util.ArrayList;

public class DataStore {
	private String error;
	private static DataStore instance;
	private ArrayList<Takim> takimlar;
	private ArrayList<Karsilasma> karsilasmalar;
	
	public static DataStore getInstance() {
		if (instance == null) {
			instance = new DataStore();
		}
		return instance;
	}

	private DataStore() {
		error = "";
		takimlar = new ArrayList<Takim>();
		karsilasmalar = new ArrayList<Karsilasma>();
	}
	
	public String getErrorMessage() {
		return error;
	}

	public ArrayList<Takim> getTakimlar() {
		return takimlar;
	}

	public ArrayList<Karsilasma> getKarsilasmalar() {
		return karsilasmalar;
	}
	
	public boolean takimEkle(int takimNo, String takimAdi, Futbolcu[] futbolcular) {
		clearErrorMessage();
		if (takimBul(takimNo) != null) {	
			setErrorMessage("Bu numaraya sahip takim var: " + takimNo);
			return false;
		} else if (takimNo < 1 || takimNo > 99) {
			setErrorMessage("Takim numarasi 1 ile 99 arasinda olmali: " + takimNo);
			return false;
		} else if (takimAdi.length() > 20) {
			setErrorMessage("Takim adi 20 karakterden uzun olamaz: " + takimNo);
			return false;
		} else if (!futbolcuKontrolEt(futbolcular, takimNo)) {
			return false;
		} else {
			Takim takim = new Takim(
					takimAdi,
					takimNo,
					0,
					0,
					0,
					0,
					0,				
					futbolcular);
			
			takimlar.add(takim);
			return true;
		}
	}
	
	public Takim takimBul(int takimNo) {
		for (Takim t : takimlar) {
			if (t.getTakimKodu() == takimNo) {
				return t;
			}
		}
		return null;
	}
	
	public boolean karsilasmaEkle(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) {
		clearErrorMessage();
		Takim evSahibiTakim = takimBul(evSahibiTakimNo);
		Takim misafirTakim = takimBul(misafirTakimNo);
		
		if (evSahibiTakim != null && misafirTakim != null) {
			Karsilasma karsilasma = new Karsilasma(
					haftaNo,
					evSahibiTakim,
					misafirTakim,
					evSahibiGolSayisi,
					misafirGolSayisi);
			
			karsilasmalar.add(karsilasma);
			evSahibiTakim.golSayisiGuncelle(evSahibiGolSayisi, misafirGolSayisi);
			misafirTakim.golSayisiGuncelle(misafirGolSayisi, evSahibiGolSayisi);
			
			return true;
		} else {
			setErrorMessage("Ev sahibi takim veya misafir takim bulunamadi");
			return false;
		}
	}
	
	public boolean golSayisiEkle(int haftaNo, int takimNo, int formaNo, int golSayisi) {
		Futbolcu futbolcu = futbolcuBul(takimNo, formaNo);
		if (futbolcu != null) {
			futbolcu.golSayisiGuncelle(golSayisi);
			return true;
		} else {
			return false;
		}
	}
	
	public Futbolcu futbolcuBul(int takimNo, int formaNo) {
		clearErrorMessage();
		Takim takim = takimBul(takimNo);
		if (takim != null) {
			for (Futbolcu f : takim.getFutbolcular()) {
				if (f.getTakimKodu() == takimNo) {
					return f;
				}
			}
		} else {
			setErrorMessage(takimNo + " numarali takim bulunamadi");
			return null;
		}
		setErrorMessage(formaNo + " forma numarali futbolcu bulunamadi");
		return null;
	}
	
	public Karsilasma[] karsilasmaBul(int takimNo) {
		clearErrorMessage();
		ArrayList<Karsilasma> sonuclar = new ArrayList<Karsilasma>();
		for (Karsilasma k : karsilasmalar) {
			if (k.getEvSahibiTakim().getTakimKodu() == takimNo
					|| k.getMisafirTakim().getTakimKodu() == takimNo) {
				
				sonuclar.add(k);
			}
		}
		Karsilasma[] sonucDizisi = new Karsilasma[sonuclar.size()];
		sonuclar.toArray(sonucDizisi);
		return sonucDizisi;
	}
	
	public void tumVerileriListele() {
		System.out.println("\nTakimlar\n"
				+ "Ad" + "               " + "Kod" + "   " + "Galibiyet" + "   "
				+ "Maglubiyet" + "   " + "Beraberlik" + "   " + "Attigi Gol" + "   " + "Yedigi Gol");
		for (Takim t : takimlar) {
			System.out.format("%-17s%-6d%-12d%-13d%-13d%-13d%-10d\n",
					t.getTakimAdi(),
					t.getTakimKodu(),
					t.getGalibiyetSayisi(),
					t.getMaglubiyetSayisi(),
					t.getBeraberlikSayisi(),
					t.getAttigiGolSayisi(),
					t.getYedigiGolSayisi());
		}
		
		System.out.println("\n\nKarsilasmalar\n"
				+ "Hafta No" + "               " + "Ev Sahibi" + "           " + "Misafir" + "             "
				+ "Ev Sahibi Gol Sayisi" + "   " + "Misafir Gol Sayisi");
		for (Karsilasma k : karsilasmalar) {
			System.out.format("%-23d%-20s%-20s%-23d%-18d\n",
					k.getHaftaNo(),
					k.getEvSahibiTakim().getTakimAdi(),
					k.getMisafirTakim().getTakimAdi(),
					k.getEvSahibiTakimGolSayisi(),
					k.getMisafirTakimGolSayisi());
		}
	}
	
	private boolean futbolcuKontrolEt(Futbolcu[] futbolcular, int takimNo) {
		clearErrorMessage();
		for (Futbolcu f : futbolcular) {
			if (f.getTakimKodu() != takimNo) {
				setErrorMessage(f.getFormaNumarasi() + " forma numarali futbolcunun takim kodu eslesmiyor: " + f.getTakimKodu());
				return false;
			} else if (f.getTakimKodu() < 1 || f.getTakimKodu() > 99) {
				setErrorMessage(f.getFormaNumarasi() + " forma numarali futbolcunun takim kodu hatali: " + f.getTakimKodu());
				return false;
			} else if (f.getFormaNumarasi() < 1 ||f.getFormaNumarasi() > 99) {
				setErrorMessage("Forma numarasi 1 ile 99 arasinda olmali: " + f.getFormaNumarasi());
				return false;
			} else if (f.getAdSoyad().length() > 20) {
				setErrorMessage("Futbolcu adi 20 karakterden uzun olamaz: " + f.getAdSoyad());
				return false;
			}
		}
		return true;
	}
	
	private void setErrorMessage(String message) {
		error = message;
	}
	
	private void clearErrorMessage() {
		error = "";
	}
}
