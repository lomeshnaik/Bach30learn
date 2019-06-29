package corejava.loops;
import java.util.Scanner;
public class GuessingGameLoopsMethod {

    static Scanner sc = new Scanner(System.in);
    static boolean keepPlaying =true;

    public static void main(String[] args) {

        System.out.println("Let's Play a Guessing Game !");

        while (keepPlaying) {

            playAround();
        }
        System.out.println("Thank you for Playing !");
    }

    public static void playAround() {
        boolean validInput;
        int number, guess;
        String answer;

        //Pick up the number
        number = (int) (Math.random() * 10 + 1);
        System.out.println("\n I'm thinking of number" + " Between 1 and 10.");

        // Get the Guess
        System.out.println(" whet Do You think it is ?");

        do {
            guess = sc.nextInt();
            validInput = true;
            if ((guess < 1) || (guess > 10)) {

                System.out.println("I Said, Between 1" + " and 10. Try Again:");
                validInput = false;
            }
        }   while (!validInput);

            //check the Guess

            if (guess == number)
                System.out.println("Yes You Are Right....!");
            else
                System.out.println("You Are Wrong ...!" + " The Number was " + number);

           do {
               System.out.println("\nPlay Again ?(Y or N)");
               answer = sc.next();
               validInput = true;
               if (answer.equalsIgnoreCase("Y")) ;
               else if (answer.equalsIgnoreCase("N"))
                   keepPlaying = false;
               else
                   validInput = false;
           }
           while (!validInput);

        }
    }





