package corejava.methods;

import corejava.classesexample.pojo.Pen;

public class SetterGetterMethodExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setLength(7);
        pen.setName("MATE");
        pen.setBrand("RONALD");
        System.out.println("Length of the pen = "+ pen.getLength());
        System.out.println("Length of the pen = "+ pen.getName());
        System.out.println("Length of the pen = "+ pen.getBrand());
        System.out.println(pen);




    }
}
