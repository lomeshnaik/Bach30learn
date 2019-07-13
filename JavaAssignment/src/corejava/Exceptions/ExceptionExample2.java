package corejava.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
       // Getting valid integer
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter the Integer value:");
            int i = getAnInteger();
            System.out.println("Your entered Integer value:" + i);
        }

        public static int getAnInteger(){
            while(!sc.hasNextInt())
            {    sc.nextLine();
                    System.out.println("That's not an integer.Try Again:");
                }
            return  sc.nextInt();
            }
        }




