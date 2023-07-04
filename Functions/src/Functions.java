import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		
		int num1=7;
		int num2=8;
		int dönenCevap=toplama(num1,num2);
		System.out.println(dönenCevap);
		System.out.println(merhaba("Emre"));
		System.out.println(yılBul(27));
		
		bye();
		
	}

	public static int toplama(int say1, int sayı2) {

		int total;
		total = say1 + sayı2;

		return total;

	}
	public static String merhaba(String ad) {
		
		return "Merhaba " + ad;
	}
	public static String yılBul(int yaş) {
		int yıl = 2022 - yaş;
		return yıl + " Yılında Doğdunuz";
		
	}
	public static void bye() {
		System.out.println("Merhaba");
		}
}
