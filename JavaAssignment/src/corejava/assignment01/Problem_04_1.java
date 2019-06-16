package corejava.assignment01;

import java.util.Scanner;

public class Problem_04_1 {

    static Scanner sc = new Scanner(System.in); //scanner class for user input
    // convert hexadecimal to decimal
    //and convert decimal to hexadecimal
    public static void main(String[] args) {

        System.out.println("..................................");
        System.out.println("Enter the value of Hexadecimal:");
        System.out.println("..................................");

        String hex = sc.nextLine();// to read string from user............................
         int decimal = Integer.parseInt( hex, 16);
         System.out.println("The Decimal value is =" + decimal);

        System.out.println("..................................");
         System.out.println("Enter the Decimal number: ");
        System.out.println("..................................");

         int dec =sc.nextInt(); // to read string from user
         String hexNumber =Integer.toHexString(dec); //
         System.out.println("The Hexadecimal value is =" + hexNumber);



    }

}
