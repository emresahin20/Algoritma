package girişSimilasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String pass = "12345";
		System.out.println("Şİfre giriniz: ");
		
		Scanner scan = new Scanner(System.in);
		String userPass= scan.nextLine();
		
		if(userPass.equals(pass)) {
			System.out.println("Şifre Başarılı");
		}else {
			System.out.println("Şİfre Yanlış");
		}

	}

}
