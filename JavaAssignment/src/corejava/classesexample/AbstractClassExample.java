package corejava.classesexample;

public class AbstractClassExample {
    public static void main(String[] args) {
        Student1 obj = new Student2();
        obj.phoneCall();
        obj.phoneMove();
        obj.phoneDance();
        obj.phoneCook();
        System.out.println();
        Student1 obj1 = new Student3();
        obj1.phoneCall();
        obj1.phoneMove();
        obj1.phoneDance();
        obj1.phoneCook();
    }
}
abstract class Student1
{
    public void phoneCall()
    {
        System.out.println("Phone can Call by student1");
        }
        public abstract void phoneMove();
        public abstract void phoneDance();
        public abstract void phoneCook();
}
class Student2 extends Student1  // student2 class can be the Abstract or implement by Override
{
    public  void phoneMove()
    {
    System.out.println("Phone can Move by student2");
    }

    @Override     //implements the method
    public void phoneDance() {
        System.out.println("try to make phone dance but not succeed by student2 ");

    }

    @Override //implements the method
    public void phoneCook() {
       System.out.println("try to make phone Cook but not succeed by student2 ");

    }
}
 class Student3 extends Student2
{
    public void phoneDance()
    {

        System.out.println("Phone can Dance by student3");
    }
    public void phoneCook()
    {
        System.out.println("Phone can Cook by student3");
    }
}
