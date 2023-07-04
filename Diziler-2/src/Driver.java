import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[][] numbers = new int[2][3];

		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;

		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;

		System.out.println(Arrays.toString(numbers));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(numbers[i][j]);
			}
		}

		String[][] str = new String[2][3];

		str[0][0] = "Emre";
		str[0][1] = "Şahin";
		str[0][2] = "AAAA";

		str[1][0] = "BBBB";
		str[1][1] = "CCCCC";
		str[1][2] = "DDDD";

		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(i + " " + j +":");
				System.out.println(str[i][j]);

			}
		}
	}
}
