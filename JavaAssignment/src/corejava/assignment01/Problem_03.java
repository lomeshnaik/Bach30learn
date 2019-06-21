package corejava.assignment01;
import java.util.Scanner;
/*
(Summation of a series) Write a program that displays the result of
				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.................
*/
public class Problem_03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Number to be summed:\t\t  ");
		double summation= 0;
		int x = sc.nextInt();
		for (int  i = 0 ; i <= x; i++) {

			summation = summation + i;
		}
		System.out.println("Summation of enter number = " + summation);
	}
}