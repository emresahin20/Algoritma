package kdvHesaplama;

public class Main {

	public static void main(String[] args) {
		
		int fiyat=100;
		int kdv;
		int sonFiyat;
		kdv=(fiyat*18)/100;
		
		sonFiyat=kdv+fiyat;
		
		System.out.println(sonFiyat);

	}

}
