package corejava.Inheritance;

import corejava.classesexample.pojo.Address;
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
        Address add1= new Address();
        add1.address ="usa";
        //String add2 = add1.getAddress();
        //Employee2 add1 = new Employee2(new Address());
        Employee2 itEmp2 = new ITEmployee2(31, "priyamnaik,", "sale",add1, "java");
        ref.printDetail(itEmp2);
        Employee2 taxEmp2 = new TaxEmployee2(31, "priyamnaik,",  "car lone");
        ref.printDetail(taxEmp2);

    }

    public void printDetail(Employee2 emp2) {
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getDepartment());
       System.out.println(emp2.getAddress());


        if (emp2 instanceof ITEmployee2) {
            ITEmployee2 itEmp2 = (ITEmployee2) emp2;
            System.out.println(itEmp2.getProgrammingExperience());
           // System.out.println(itEmp2.getDepartment());
           // System.out.println(itEmp2.getAddress());
        } else if (emp2 instanceof TaxEmployee2){
            TaxEmployee2 taxEmp2 = (TaxEmployee2) emp2;
            System.out.println(taxEmp2.getTaxType());
            //System.out.println(taxEmp2.getDepartment());
           // System.out.println(taxEmp2.getAddress());
        }

    }
}
