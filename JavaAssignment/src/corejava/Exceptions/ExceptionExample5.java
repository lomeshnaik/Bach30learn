package corejava.Exceptions;
import java.util.Scanner;

//finally Block

public class ExceptionExample5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter an integer");
        int a = sc.nextInt();
        System.out.println("enter a Second integer");
        int b = sc.nextInt();
        try {
            int answer = divideThisNumber( a, b);
        }
        catch (Exception e){
            System.err.println("Try Twice, still didn't work!");
        }
        }
        public static int divideThisNumber(int a,int b) throws Exception {
        int c;
        try {
            c=a/b;
            System.out.println("it worked");
        } catch (Exception e){
            System.err.println("Didn't work the first time");
            c=a/b;
            System.err.println("it worked the second time!");
        }
        finally {
            System.err.println("Batter cleanup my mess.");
        }
        System.err.println("it worked after all.");
        return c;

        }

    }











