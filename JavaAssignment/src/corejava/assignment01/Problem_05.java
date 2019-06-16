package corejava.assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a rectangle) Displays the area and
perimeter of a rectangle with the width of 6.5 and height of 4.9 using the following
formula:

						area = width * height
						perimeter = (width + height) * 2

NOTE:
	pass width and height as an input to the program.
*/
public class Problem_05 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value  of width of the Rectangle:\n");
		double wi = sc.nextDouble();
		System.out.println("Enter the value  of height of the Rectangle\n");
		double hi = sc.nextDouble();

		double area = (wi * hi);
		System.out.println("Area of the Rectangle is  = " + area);

		double perimeter = ( wi + hi ) * 2;
		System.out.println("Perimeter of the Rectangle is  = " + perimeter );


	}
}