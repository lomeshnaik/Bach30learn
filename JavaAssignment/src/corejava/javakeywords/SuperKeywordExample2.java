package corejava.javakeywords;

// super key word as a objects

public class SuperKeywordExample2 {
    public static void main(String[] args) {
        E obj = new E();
        obj.abc();
        D obj1 = new D();
    }
}
class D
{
    public void abc() {
        System.out.println("A abc method");
    }

    //int i =6; try  // super key word as a objects
}
class E extends D {
    public void abc() {

        super.abc(); // super key word as a objects***********************
        System.out.println("B abc method");
        //public void shaw(){ try
        //System.out.println("Print i="+ i); try
        // }
    }
}