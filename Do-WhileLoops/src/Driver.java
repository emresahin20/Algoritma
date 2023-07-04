import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		int number;
		int number1;
		int number2;
		int number3;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("4 tane Sayı Giriniz");
		
		number =scan.nextInt();
		number1 =scan.nextInt();
		number2=scan.nextInt();
		number3 =scan.nextInt();
		System.out.println(number);
		System.out.println(number1+number);
		System.out.println(number1+number2);
		System.out.println(number2+number3);
		
		
		
		
	}
}
