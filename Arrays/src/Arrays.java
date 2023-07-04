
public class Arrays {

	public static void main(String[] args) {

//		int x0, x1, x2, x3, x4;
//		x0 = 3;
//		x1 = 4;
//		x2 = 0;
//		x3 = 5;
//		x4 = 9;
//
//		int [] sayıDizisi = new int[10];
//		sayıDizisi[0]=1;
//		sayıDizisi[4]=8;
//		sayıDizisi[6]=9;
//		sayıDizisi[9]=4;
//		
//		int a= sayıDizisi[6];
//		System.out.println(a);
//		
//		for (int i = 0; i < sayıDizisi.length; i++) {
//			System.out.println(sayıDizisi[i]);
//		}
//		
//		String [] yazıDizisi = {"Emre","Java","Apple"};
//		for (int i = 0; i < yazıDizisi.length; i++) {
//			System.out.println(yazıDizisi[i]);
//			
//		}
		int[][] çiftBoyutlu = new int[3][10];
		çiftBoyutlu[2][7]=20;
		çiftBoyutlu[0][0]=10;
		çiftBoyutlu[1][3]=30;
		
		for (int i = 0; i < çiftBoyutlu.length; i++) {
			for (int j = 0; j < çiftBoyutlu[0].length; j++) {
				System.out.println(çiftBoyutlu[i][j]);
				
				
			}
		}
		
	}

}
