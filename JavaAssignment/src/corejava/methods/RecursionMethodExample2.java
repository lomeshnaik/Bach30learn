package corejava.methods;

import java.util.Scanner;

public class RecursionMethodExample2 {

    public static int factorial(int num) {

        if (num == 1){
            return 1;
            }else {
            return (num * factorial(num-1));
        }

        }
static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Factorial number:");
        int num = sc.nextInt();
          System.out.println("Factorial of "+num+" is=  " +factorial(num));
    }
}
