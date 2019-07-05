package corejava.classesexample.pojo;

public class Employee {
    public int id;
    public String name;
    public  String department;
    public String address;

    public Employee(int id){
        this.id = id;
    }
    public Employee (int id , String name){
        this.id =id;
        this.name = name;
    }
    public Employee (int id , String name,String department, String address ) {
        this(id, name);
        this.department = department;
        this.address = address;
    }

    }


