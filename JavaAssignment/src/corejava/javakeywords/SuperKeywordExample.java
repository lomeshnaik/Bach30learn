package corejava.javakeywords;

// super key word as a method

public class SuperKeywordExample {

    public static void main(String[] args) {

         //A obj = new A();
         B obj1 = new B(5);
    }
}
class A  //Super Class extends Object class by default java
{
    public A()//
    {
        //super(); by default available by java
        System.out.println("In const A before");
    }
    public A(int i){
        System.out.println("In const A para");

    }

}
 class B extends A   //sub class
 {

    public B() {
        //super(); by default available by java
        System.out.println("In const B After");
    }

     public B(int i){

        super(i); // try delete super then (i)
         System.out.println("In const B para");

     }
 }
