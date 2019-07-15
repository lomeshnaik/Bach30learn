package corejava.Inheritance;

import corejava.classesexample.pojo.ITEmployee.Employee2;
import corejava.classesexample.pojo.ITEmployee.ITEmployee2;
import corejava.classesexample.pojo.ITEmployee.TaxEmployee2;

public class InstanceOfExample {
    public static void main(String[] args) {

        InstanceOfExample ref = new InstanceOfExample();

       //Employee2 itEmp1 = new ITEmployee2(21, "lomeshnaik");
        //ref.printCommonDetail(itEmp1);

        //Employee2 taxEmp1 = new TaxEmployee2(31, "priyamnaik,", "sale", "usa");
        //ref.printCommonDetail(taxEmp1);

        Employee2 itEmp2 = new ITEmployee2(31, "priyamnaik,", "sale", "usa", "java");
        ref.printDetail(itEmp2);
        Employee2 taxEmp2 = new TaxEmployee2(31, "priyamnaik,",  "car lone");
        ref.printDetail(taxEmp2);

    }

    public void printDetail(Employee2 emp2) {
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getDepartment());

        if (emp2 instanceof ITEmployee2) {
            ITEmployee2 itEmp2 = (ITEmployee2) emp2;
            System.out.println(itEmp2.getProgrammingExperience());
        } else if (emp2 instanceof TaxEmployee2){
            TaxEmployee2 taxEmp2 = (TaxEmployee2) emp2;
            System.out.println(taxEmp2.getTaxType());
        }

    }
}
