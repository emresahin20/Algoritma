import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		int[] numbers;
		
		numbers = new int[15];
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("------------------");
		
		int [] num ={1,2,3,4,5,6,7,8};
		
		System.out.println(num[5]);
		System.out.println(num.length);
		
		String [] str = new String[10];
		
		System.out.println(Arrays.toString(str));
		
		str [3] = "Ali";
		System.out.println(Arrays.toString(str));
		
		str[5] = "Hasan";
		System.out.println(Arrays.toString(str));
		
		str[13]="Ahmet";
		System.out.println(Arrays.toString(str));
	}

}
