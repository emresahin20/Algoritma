import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Dizi uzunluğu :");
		
		int length= scan.nextInt();
		int[] numbers=new int[length];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((i+1) + ". Sayı; ");
			numbers[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		int total=0;
		for (int i = 0; i < numbers.length; i++) {
			total=total + numbers[i];
			
		}
		System.out.println(total/numbers.length);
	}
}
