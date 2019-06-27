package corejava.forloop;

import java.util.Scanner;

public class UniCodeCharacters {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println("Enter the Starting Code : ");
        int startcode =  sc.nextInt();
        char start = (char)startcode;
        System.out.println(start);
        System.out.println("Enter the End Code : ");
        int endcode = sc.nextInt();
        char end = (char)endcode;
        System.out.println(end);


        for (int i = start ; i <= endcode ; i++ ){
            //System.out.println(" Char:" + Integer.toHexString( i ) + "==>" + (char)i );
            System.out.print("\t"+ (char)i );

            //for (int i = ''; i <= 1000 ; i++ ){
            //            System.out.println(" Char:" + Integer.toHexString( i ) + "==>" + (char)i );
            //            System.out.print("\t"+ (char)i );

        }

    }

}
