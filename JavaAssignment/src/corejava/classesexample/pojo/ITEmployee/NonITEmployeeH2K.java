package corejava.classesexample.pojo.ITEmployee;

import corejava.classesexample.pojo.ClassInterface.Running;
import corejava.classesexample.pojo.ClassInterface.Swimming;

public class NonITEmployeeH2K extends ITEmployeeH2K implements Swimming , Running {

    public NonITEmployeeH2K(int id) {
        super(id);
    }


    @Override
    public void tieColor() {
            System.out.println("The watch color is BLACK and blue");
        }

    @Override
    public void run() {
        System.out.println("All Employee can run any where");
    }

    @Override
    public void swim() {
        System.out.println("All employee can Swim in any kind of water");

    }

    }





