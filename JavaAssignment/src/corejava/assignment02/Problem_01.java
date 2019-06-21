package corejava.assignment02;

/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.Scanner;

public class Problem_01 {
    static Scanner input  = new Scanner (System.in);

    public static void main(String[] args) {
        // Create new Scanner object
        System.out.println("Enter the Temperature in Celsius:\n");
        double celsius = input.nextDouble();
        // Prompt user to input a double
        //System.out.print("Enter a degree in Celsius: ");

        double fahrenheit = ( ( 9/5 ) * celsius )+ 32 ;

        System.out.println("The Temperature in Fahrenheit: \t" + fahrenheit );

        System.out.println("Enter the Fahrenheit:\t ");

        double far = input.nextDouble();
        double cel = ( far - 32) * 5 / 9 ; //(32°F − 32) × 5/9 = 0°C
        System.out.println("The Temperature in celsius: \t" + cel );
    }


    }


