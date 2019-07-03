package corejava.javakeywords;

public class ThisKeyWordExample {

    public static void main(String[] args) {

        T adj = new T(33);
        adj.show();

    }
} //new class must be out side of class body
     class T
    {

        private int x;  // x is instant variable ----

        public T(int x) // change <x> to <a>  variable name or < a >to < x >  ais local variable
        {
           this.x = x; // then try using This key word
        }

        public void show() //method
        {
        System.out.println("The value of x is :" +x);
        }
    }


