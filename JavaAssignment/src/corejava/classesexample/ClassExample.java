package corejava.classesexample;

import corejava.classesexample.pojo.Address;
import corejava.classesexample.pojo.Person;
import corejava.classesexample.pojo.Student;

public class ClassExample {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "tom";
        p.height = 4;
        p.weight = 40;
        Address pAddress = new Address();
        pAddress.address = "chambe ct";
        pAddress.address2 = "lilburn";
        pAddress.zip = "33333";
        pAddress.country = "usa";

        Student s = new Student();
        s.name = "lom";
        s.height = 5;
        s.weight = 140;
        Address sAddress =new Address();
        sAddress.address = "chambe ct sw";
        sAddress.address2 = "lilburn";
        sAddress.zip = "33333";
        sAddress.country = "USA";

        System.out.println();


    }
}
