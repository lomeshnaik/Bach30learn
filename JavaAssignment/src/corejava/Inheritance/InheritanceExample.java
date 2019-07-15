package corejava.Inheritance;

import corejava.classesexample.pojo.ITEmployee.ITEmployee2;
import corejava.classesexample.pojo.ITEmployee.TaxEmployee2;

public class InheritanceExample {
    public static void main(String[] args) {
        ITEmployee2  itEmp = new ITEmployee2(21);
        System.out.println(itEmp.getId());
        System.out.println(itEmp.getProgrammingExperience());


        TaxEmployee2 taxEmp = new TaxEmployee2(31);
        System.out.println(taxEmp.getId());
        System.out.println(taxEmp.getTaxType());

    }


}
