package corejava.assignment02;

/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
*/
import java.util.Scanner;


public class Problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;

        // Prompt user to enter the radius and length of a cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        System.out.println("The area of the Cylinder :\t" + area);
        double volume = area * length;
        System.out.println("The Volume of the Cylinder :\t" + volume);

       System.out.println("Compute area and volume and print the value:\t " + area +";\t \t" + volume);
    }
}
