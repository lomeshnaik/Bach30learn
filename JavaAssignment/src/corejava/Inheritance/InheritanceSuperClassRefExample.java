package corejava.Inheritance;

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
        ref.printEmployeeDetail(itEmp);
        // System.out.println(taxEmp.getId());
        // System.out.println(taxEmp.getTaxType());
        Employee2 itEmp1 = new ITEmployee2(21, "lomeshnaik");
        ref.printCommonDetail(itEmp1);
        Employee2 taxEmp1 = new TaxEmployee2(31, "priyamnaik,", "sale", "usa");
        ref.printCommonDetail(taxEmp1);

        Object obj = new ITEmployee2(21, "lomeshnaik");
        System.out.println(obj.toString());
        Object obj2 = new TaxEmployee2(31, "priyamnaik,", "sale", "usa");
        System.out.println(obj.toString());


    }

    public void printCommonDetail(Employee2 emp2) {
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getDepartment());
    }
    public void printEmployeeDetail(ITEmployee2 itEmp) {
        System.out.println(itEmp.getId());
        System.out.println(itEmp.getName());
        System.out.println(itEmp.getDepartment());

    }

    public void printEmployeeDetail(TaxEmployee2 taxEmp) {
        System.out.println(taxEmp.getId());
        System.out.println(taxEmp.getName());
        System.out.println(taxEmp.getDepartment());


    }
}
