package corejava.classesexample;

public class AbstractClassExample {
    public static void main(String[] args) {
        Student1 obj = new Student3();
        obj.phoneCall();
        obj.phoneCook();
        obj.phoneMove();
        obj.phoneDance();
    }
}
abstract class Student1
{
    public void phoneCall(){
        System.out.println("Phone can Call");
        }
        public abstract void phoneMove();
        public abstract void phoneDance();
        public abstract void phoneCook();
}
abstract class Student2 extends Student1
{
    public  void phoneMove()
    {
    System.out.println("Phone can Move");
    }
}
 class Student3 extends Student2
{
    public void phoneDance()
    {
        System.out.println("Phone can Dance");
    }
    public void phoneCook()
    {
        System.out.println("Phone can Cook");
    }
}
