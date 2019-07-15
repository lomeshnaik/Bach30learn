package corejava.classesexample.pojo.ClassInterface;

public class Elephant extends Animal implements Swimming {

    @Override
    public void swim() {
        System.out.println("An Elephant can Swim in any kind of water");
    }
}
