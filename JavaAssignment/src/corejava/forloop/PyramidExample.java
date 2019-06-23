package corejava.forloop;

import java.util.Scanner;

public class PyramidExample {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the pyramid Number");
		int rows = scan.nextInt();
		System.out.println("Enter diff. between two numbers");
		int diff = scan.nextInt();
		int y = 0;
		for (int i = 0; i <= rows; i++) {
			for (int j = 0 ; j <= i ; j++){
					y = y + diff;
					System.out.print(" " +y);
				}
			System.out.println();

             //System.out.println("Opposite Pyramid");
			//int z = 0;
			//for (int k =rows ; k >= 1 ; --k){
			//	for (int x = 1 ; x >= k; ++x ){
			//		z = z + 4;
			//		System.out.print(" " +y);
				//}

			}

}
}

