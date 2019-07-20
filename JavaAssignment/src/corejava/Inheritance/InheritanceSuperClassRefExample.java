package corejava.Inheritance;

import corejava.classesexample.pojo.Address;
import corejava.classesexample.pojo.ITEmployee.Employee2;
import corejava.classesexample.pojo.ITEmployee.ITEmployee2;
import corejava.classesexample.pojo.ITEmployee.TaxEmployee2;

public class InheritanceSuperClassRefExample {
    public static void main(String[] args) {

        InheritanceSuperClassRefExample ref = new InheritanceSuperClassRefExample();

        ITEmployee2 itEmp = new ITEmployee2(21, "lomesh");
        ref.printEmployeeDetail(itEmp);
        //System.out.println(itEmp.getId());
        // System.out.println(itEmp.getProgrammingExperience());


        TaxEmployee2 taxEmp = new TaxEmployee2(31, "priyam,");
        ref.printEmployeeDetail(taxEmp);
        // System.out.println(taxEmp.getId());
        // System.out.println(taxEmp.getTaxType());
        Employee2 itEmp1 = new ITEmployee2(21, "lomeshnaik");
        ref.printCommonDetail(itEmp1);
        Address add1= new Address("usa");
        Employee2 taxEmp1 = new TaxEmployee2(31, "priyamnaik,", "sale", add1);
        ref.printCommonDetail(taxEmp1);
        Address add2= new Address("usa");
        Object obj = new ITEmployee2(21, "lomeshnaik");
        System.out.println(obj.toString());
        Object obj2 = new TaxEmployee2(31, "priyamnaik,", "sale",add2);
        System.out.println(obj.toString());


    }

    public void printCommonDetail(Employee2 emp2) {
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getDepartment());
        System.out.println(emp2.getAddress());
    }
    public void printEmployeeDetail(ITEmployee2 itEmp) {
        System.out.println(itEmp.getId());
        System.out.println(itEmp.getName());
        System.out.println(itEmp.getDepartment());
        System.out.println(itEmp.getAddress());

    }

    public void printEmployeeDetail(TaxEmployee2 taxEmp) {
        System.out.println(taxEmp.getId());
        System.out.println(taxEmp.getName());
        System.out.println(taxEmp.getDepartment());
        System.out.println(taxEmp.getAddress());
    }


}
