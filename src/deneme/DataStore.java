package deneme;

import java.util.ArrayList;

public class DataStore {
	private static DataStore instance;
	private ArrayList<TakimTipi> takimlar;
	private ArrayList<KarsilasmaTipi> karsilasmalar;
	private ArrayList<GolSayisiTipi> golSayilari;
	
	public static DataStore getInstance() {
		if (instance == null) {
			instance = new DataStore();
		}
		return instance;
	}

	private DataStore() {
		takimlar = new ArrayList<TakimTipi>();
		karsilasmalar = new ArrayList<KarsilasmaTipi>();
		golSayilari = new ArrayList<GolSayisiTipi>();
	}

	public ArrayList<TakimTipi> getTakimlar() {
		return takimlar;
	}

	public ArrayList<KarsilasmaTipi> getKarsilasmalar() {
		return karsilasmalar;
	}

	public ArrayList<GolSayisiTipi> getGolSayilari() {
		return golSayilari;
	}
	
	public boolean takimEkle(int takimNo, String takimAdi, FutbolcuTipi[] futbolcular) {
		try {			
			TakimTipi takim = new TakimTipi(
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
		} catch(Exception e) {
			return false;
		}
	}
	
	public TakimTipi takimBul(int takimNo) {
		for (TakimTipi t : takimlar) {
			if (t.getTakimKodu() == takimNo) {
				return t;
			}
		}
		return null;
	}
	
	public boolean karsilasmaEkle(int haftaNo, int evSahibiTakimNo, int misafirTakimNo, int evSahibiGolSayisi, int misafirGolSayisi) {
		TakimTipi evSahibiTakim = takimBul(evSahibiTakimNo);
		TakimTipi misafirTakim = takimBul(misafirTakimNo);
		
		if (evSahibiTakim != null && misafirTakim != null) {
			KarsilasmaTipi karsilasma = new KarsilasmaTipi(
					haftaNo,
					evSahibiTakim,
					misafirTakim,
					evSahibiGolSayisi,
					misafirGolSayisi);
			
			karsilasmalar.add(karsilasma);
			evSahibiTakim.golSayisiGuncelle(evSahibiGolSayisi, misafirGolSayisi);
			misafirTakim.golSayisiGuncelle(misafirGolSayisi, evSahibiGolSayisi);
			
			return true;
		}
		return false;
	}
	
	public boolean golSayisiEkle(int haftaNo, int takimNo, int formaNo, int golSayisi) {
		try {
			GolSayisiTipi gol = new GolSayisiTipi(
					haftaNo,
					takimNo,
					formaNo,
					golSayisi);
			
			golSayilari.add(gol);
			
			FutbolcuTipi futbolcu = futbolcuBul(takimNo, formaNo);
			if (futbolcu != null) {
				futbolcu.golSayisiGuncelle(golSayisi);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public FutbolcuTipi futbolcuBul(int takimNo, int formaNo) {
		TakimTipi takim = takimBul(takimNo);
		if (takim != null) {
			for (FutbolcuTipi f : takim.getFutbolcular()) {
				if (f.getTakimKodu() == takimNo) {
					return f;
				}
			}
		}
		return null;
	}
	
	public KarsilasmaDizisi karsilasmaBul(int takimNo) {
		//ArrayList<KarsilasmaTipi> sonuclar = new ArrayList<KarsilasmaTipi>();
		KarsilasmaDizisi sonuclar = new KarsilasmaDizisi();
		for (KarsilasmaTipi k : karsilasmalar) {
			if (k.getEvSahibiTakim().getTakimKodu() == takimNo
					|| k.getMisafirTakim().getTakimKodu() == takimNo) {
				
				sonuclar.add(k);
			}
		}
		//KarsilasmaTipi[] sonucDizisi = new KarsilasmaTipi[sonuclar.size()];
		//sonuclar.toArray(sonucDizisi);
		return sonuclar;
	}
	
	public void tumVerileriListele() {
		System.out.println("\nTakimlar\n"
				+ "Ad" + "               " + "Kod" + "   " + "Galibiyet" + "   "
				+ "Maglubiyet" + "   " + "Beraberlik" + "   " + "Attigi Gol" + "   " + "Yedigi Gol");
		for (TakimTipi t : takimlar) {
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
		for (KarsilasmaTipi k : karsilasmalar) {
			System.out.format("%-23d%-20s%-20s%-23d%-18d\n",
					k.getHaftaNo(),
					k.getEvSahibiTakim().getTakimAdi(),
					k.getMisafirTakim().getTakimAdi(),
					k.getEvSahibiTakimGolSayisi(),
					k.getMisafirTakimGolSayisi());
		}
	}
}
