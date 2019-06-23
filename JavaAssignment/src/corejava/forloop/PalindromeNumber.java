package corejava.forloop;

import java.util.Scanner;
/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the 
 * same backward or forward, such as madam or kayak.
 * @author jrout
 *https://en.wikipedia.org/wiki/Palindrome
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int number = scan.nextInt();
		boolean isPalindrome = false;
		int temp = number;
		int reverse;

		// Your logic goes here...to set the boolean value
		// Use for loop.

		for (reverse= 0; temp > 0 ; temp = temp/10 )
		{
			int reminder =  temp % 10;
			reverse = reverse * 10 +reminder;

		}

		System.out.println("The Reverse of the Entered palindrome number is : \t " + reverse);


		if((number != reverse) == isPalindrome){
			System.out.println(number+" is Palindrom");
		}else{
			System.out.println(number+" is not a Palindrom number ");
		}



	}

}
// 161 is a palindrome number