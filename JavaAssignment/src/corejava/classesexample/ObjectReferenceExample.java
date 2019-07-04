package corejava.classesexample;

import corejava.classesexample.pojo.Person;

public class ObjectReferenceExample {
    public static void main(String[] args) {
   Person lom = new Person();
      lom.name = "LOMESH";
      System.out.println(lom.name);
      Person pri = lom;
       pri.name = "Priyam";
       System.out.println(pri.name);
       //**************************************************************
        int a = 10;
        ObjectReferenceExample objref = new ObjectReferenceExample();
        System.out.println("Before = "+a);
        objref.changePremetiveValue(a);
        System.out.println("After = "+a);
//*********************************************************
        Person person =new Person();
        person.name = "Tom";
        System.out.println("Before = "+ person.name);
        objref.changeObjectReferenceValue(person);
        System.out.println("After = "+ person.name);
//******************************************************************************
        String name = "Banta"; // String class is Spacial --it is Immutable
        System.out.println("Before = "+ name);
        objref.changeMeAgain(name);
        System.out.println("After = "+ name);
 }

    public void changePremetiveValue(int a){
        a = 100;
    }
   public void changeObjectReferenceValue(Person person){
        person.name = "lom";
   }
   public void changeMeAgain(String name){
        name = "Santa";
   }
}
