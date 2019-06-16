package corejava.assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi

SUGGESTIONS:
Use Math.PI for the pi value
*/
public class Problem_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------------ \n");
		System.out.println("Enter Radius of a circle : \n");
		System.out.println("------------------------------------ \n");

		float radius = scanner.nextFloat();
		System.out.println("Radius = "+ radius);

		System.out.println("---------------------------------------------------- \n");
		System.out.println("The Perimeter of the circle is = 2 *radius * pi");
		System.out.println("----------------------------------------------------- \n");

		double perimeter = 2 * radius * Math.PI ;

		System.out.println("Perimeter = " + perimeter);
		System.out.println("Perimeter round number is = " + Math.round(perimeter));// rounding number using methods

		System.out.println("----------------------------------------------------- \n");
		System.out.println("The area of the circle is = radius *radius * pi");
		System.out.println("----------------------------------------------------- \n");
		double area = radius * radius * Math.PI;
		System.out.println("Area = " + area);
		System.out.println("Area round number is = " + Math.round(area));// rounding number using methods
// The Math.ceil() function method always rounds a number up to the next largest whole number or integer.
		//The Math.floor() function returns the largest integer less than or equal to a given number.
	}
}