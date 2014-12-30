package deneme;

public class GolSayisiTipi {
	private int haftaNo;
	
	private int takimKodu;
	
	private int formaNo;
	
	private int golSayisi;

	public GolSayisiTipi(int haftaNo, int takimKodu,
			int formaNo, int golSayisi) {
		this.haftaNo = haftaNo;
		this.takimKodu = takimKodu;
		this.formaNo = formaNo;
		this.golSayisi = golSayisi;
	}

	public int getHaftaNo() {
		return haftaNo;
	}

	public void setHaftaNo(int haftaNo) {
		this.haftaNo = haftaNo;
	}

	public int getTakimKodu() {
		return takimKodu;
	}

	public void setTakimKodu(int takimKodu) {
		this.takimKodu = takimKodu;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getGolSayisi() {
		return golSayisi;
	}

	public void setGolSayisi(int golSayisi) {
		this.golSayisi = golSayisi;
	}
}
