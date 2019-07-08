package corejava.methods;

public class RecursionMethodExample {

   // public static int factorial(int num) {
    static void p(){
        System.out.println("Hello");
        p();
        }

    public static void main(String[] args) {
        p();
    }
}
//Exception in thread "main" java.lang.StackOverflowError