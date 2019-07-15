package corejava.classesexample.pojo.ClassInterface;

public class Human extends Animal implements Swimming , Running{

    @Override
    public void run() {
            System.out.println("Human can run any where");
    }

    @Override
    public void swim() {
            System.out.println("Human can Swim in any kind of water");

    }
}
