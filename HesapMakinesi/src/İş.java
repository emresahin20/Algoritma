
public class İş implements HesapMakinesi{

	int sayı1,sayı2,sonuc;
	
	@Override
	public int toplama() {
		int sonuc = 1;
		if(sonuc==1) {
			System.out.println("Sonuç :");
		}
		return sayı1 + sayı2;
	}

	@Override
	public int cıkarma() {
		int sonuc = 2;
		if(sonuc==2) {
			System.out.println("Sonuç :");
		}
		return sayı1 - sayı2;
	}

	@Override
	public int carpma() {
		int sonuc = 3;
		if(sonuc==3) {
			System.out.println("Sonuç :");
		}
		return sayı1*sayı2;
	}

	@Override
	public int bolme() {
		int sonuc = 4;
		if(sonuc==4) {
			System.out.println("Sonuç :");
		}
		return sayı1/sayı2;
	}

}
