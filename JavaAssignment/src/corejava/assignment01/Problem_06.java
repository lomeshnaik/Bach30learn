package corejava.assignment01;

import java.util.Scanner;

/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 */
public class Problem_06 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the Value of A:\n");
        int a = sc.nextInt();
        System.out.println("Enter the Value of B:\n");
        int b = sc.nextInt();

        double c = Math.pow( a , 2) + Math.pow( b , 2) + (2*( a+b ));


        System.out.println("(a + b) whole square= \t "+ c);

        System.out.println("Enter the Value of A:\n");
        a = sc.nextInt();
        System.out.println("Enter the Value of B:\n");
        b = sc.nextInt();

        c = Math.pow(4*a , 2) + Math.pow( 5*b, 2) + (2*(4*a)* (5*b));

        System.out.println("(4a + 5b) whole square= \t "+ c);


    }

}
