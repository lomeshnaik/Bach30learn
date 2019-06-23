package corejava.ifelse;

import java.util.Scanner;

/**
 * If Else-If statement Example
 * 
 *
 */
public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i =0;
		while (i <= 5){
		System.out.println("Enter a value : \n");
		int input  = scan.nextInt();

	     if(input >= 100) // Replace your code with false
	       System.out.println("i is greater than 100");
	     else if(input > 50) // Replace your code with false
	       System.out.println("i is greater than  50");
	     else
	       System.out.println("i is less than 50");
			i++;
	}

}}
/*
if input is 20
	Output would be
	input is less than 50
	
	input 110
		i is greater than 100
	input 55
		i is greater than 50
*/