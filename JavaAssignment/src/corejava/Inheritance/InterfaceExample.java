package corejava.Inheritance;

import corejava.classesexample.pojo.ClassInterface.Elephant;
import corejava.classesexample.pojo.ClassInterface.Human;
import corejava.classesexample.pojo.ClassInterface.Running;
import corejava.classesexample.pojo.ClassInterface.Swimming;
import corejava.classesexample.pojo.ITEmployee.NonITEmployeeH2K;


public class InterfaceExample {
    public static void main(String[] args) {

        Swimming swimming = new NonITEmployeeH2K(555);
        Swimming swimming1 =new Elephant();
        Swimming swimming2 =new Human();
        printSomething(swimming);
        printSomething(swimming1);
        printSomething(swimming2);

        Running running= new Human();
        running.run();

    }

    public static void printSomething(Swimming swimming){
        swimming.swim();

    }
}
