package corejava.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {
       // Getting valid integer
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter the Integer value:");
            int i = getAnInteger();
            System.out.println("Your entered Integer value:" + i);
        }

        public static int getAnInteger(){
            while(true)
            {
                try
                {
                    return  sc.nextInt();
                }
                catch (InputMismatchException e){
                    sc.next();
                    System.out.println("That's not an integer.Try Again:");

                }
            }
        }

    }


