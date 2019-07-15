package corejava.classesexample;

import corejava.classesexample.pojo.Employee;

public class ConstructorsExample {
    public static void main(String[] args) {
        ConstructorsExample ref = new ConstructorsExample();
        Employee employee =new Employee(122);
        ref.printDetail(employee);
        Employee employee1 =new Employee(122 , "lom");
        ref.printDetail(employee1);
        Employee employee3 =new Employee(122 , "lom", "sale" );
        ref.printDetail(employee3);
        //employee.id=10;
        //employee.name= "lome";
        //System.out.println("id =" + employee.id);
       // System.out.println("Name =" + employee1.name );
       // System.out.println("Dpt =" + employee.department);

    }

    public void printDetail(Employee employee){
        System.out.println("id =" + employee.id);
        System.out.println("Name =" + employee.name );
        System.out.println("Dpt =" + employee.department);
        System.out.println("Address =" + employee.address);
    }
}
