package corejava.loops;
import java.util.Scanner;

public class  SwitchLoopTest{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        int counter = 0;

        while (counter < 10) {
            System.out.println(counter + "\t" + "Attempts ");
            System.out.println("Enter the Age of Kids(age 1 to 4): ");
            age = sc.nextInt();

            switch (age){
                case 1:
                    System.out.println("yes - Start talk ");
                    break;
                case 2:
                    System.out.println("yes - Start crawl");
                    break;
                case 3:
                    System.out.println("yes Start walk");
                    break;
                case 4:
                    System.out.println("yes - Start running");

                    break;
                default:
                    System.out.println("Unexpected Age: " + age);
            }

            counter++;


        }

    }


}


