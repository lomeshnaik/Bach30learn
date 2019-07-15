package corejava.Inheritance;

import corejava.classesexample.pojo.ITEmployee.H2KEmployee;
import corejava.classesexample.pojo.ITEmployee.ITEmployeeH2K;
import corejava.classesexample.pojo.ITEmployee.TaxEmployeeH2K;

public class AbstractExample {
    public static void main(String[] args) {

        H2KEmployee h2KEmployee = new TaxEmployeeH2K(33);
        h2KEmployee.watchColor();

        H2KEmployee h2KEmployee1 = new ITEmployeeH2K(33);
        h2KEmployee1.watchColor();

    }
}
