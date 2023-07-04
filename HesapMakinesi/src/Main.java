import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		İş hesap = new İş();
		
		System.out.println("Birinci sayıyı giriniz");
		hesap.sayı1=scan.nextInt();
		
		System.out.println("İkinci sayıyı giriniz");
		hesap.sayı2=scan.nextInt();
		System.out.println("Bir İşlem Seçiniz");
		System.out.println("1=Toplama , 2=Çıkarma, 3=Çarpma , 4=Bölme");
	
		hesap.sonuc=scan.nextInt();
		
		System.out.println(hesap);
	}

}
