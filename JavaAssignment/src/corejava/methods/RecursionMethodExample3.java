package corejava.methods;

import java.util.Scanner;

// fibonacci series using Recursion method
public class RecursionMethodExample3 {

    int n1=0,n2 =1,n3=0;
    public  void printfibonoSeries (int count) {
        if (count>0){
            n3 =n1 +n2;
            n1 =n2;
            n2 =n3;
            System.out.print(" "+ n3);
                    printfibonoSeries(count-1);
        }
    }

    public static void main(String[] args) {

        RecursionMethodExample3 rme = new RecursionMethodExample3();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit number");
        int count = sc.nextInt();
        System.out.print(rme.n1 + " "+rme.n2);
        rme.printfibonoSeries(count-2);
    }
}