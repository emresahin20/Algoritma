package sayıBulma;

public class Main {
	public static void main(String[] args) {
		int[] sayılar = new int[] { 1, 2, 3, 5, 9, 6, 3 };
		int aranacak = 4;
		boolean varMı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			System.out.println("Sayı Mevcuttur.");
		} else {
			System.out.println("Sayı Mevcut Değildir.");
		}
	}
}
