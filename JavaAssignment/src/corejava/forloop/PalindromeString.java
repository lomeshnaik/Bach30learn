package corejava.forloop;

import java.util.Scanner;

public class PalindromeString {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        String original, reverse = ""; // Objects of String class
        System.out.println("Enter a string/number to check if it is a palindrome: ");
        original = sc.nextLine();
        int length = original.length();

        for (int i = length-1; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)){
            System.out.println("The Enter Value is Palindrome");
        }
        else {
            System.out.println("The Enter Value is Not Palindrome");

        }

    }



}
