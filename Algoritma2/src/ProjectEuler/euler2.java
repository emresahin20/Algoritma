package ProjectEuler;

public class euler2 {
	public static void main(String[] args) {
		int sum =2;
		
		int number1=1;
		int number2=2;
		
		while(number1<=4E6) {
			int numberCatch=number2;
			number2 +=number1;
			number1 = numberCatch;
		
		if (number2 % 2 == 0) {
			sum+=number2;
		}
			System.out.println(sum);
		}
	}

}
