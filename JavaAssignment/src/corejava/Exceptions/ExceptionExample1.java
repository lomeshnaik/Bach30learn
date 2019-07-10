package corejava.Exceptions;

public class ExceptionExample1 {
    // divided by zero
    public static void main(String[] args) {
        int a = 8,b = 0;

        try
        {
            int c = a / b ;
        }
        catch (ArithmeticException e){ //if you are not sure Specific type of Exception just say catch ( Exception e)
            System.out.println("Oops, you can't Divide by Zero ");
        }

    }

}
