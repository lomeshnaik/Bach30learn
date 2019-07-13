package corejava.Exceptions;

// methods of the Exception Class

public class ExceptionExample4 {
    public static void main(String[] args) {
        int a=9, b=0;
        try {
            int c=a/b;
        }
        catch (Exception e){
            System.out.println(e.getMessage()); // will display -- "/ by zero"

            e.printStackTrace(System.out);  /* Display --gives you full error detailjava.lang.ArithmeticException: / by zero
            at corejava.Exceptions.ExceptionExample4.main(ExceptionExample4.java:8)*/

            System.out.println(e.toString()); // display --java.lang.ArithmeticException: / by zero

            System.err.println(e.toString()); //display in red color-- java.lang.ArithmeticException: / by zero red color

            }
            /* try with catch (Exception e){ .....keep empty....  }
            call Swallowing exceptions or ignore exception......
             */
        }

    }











