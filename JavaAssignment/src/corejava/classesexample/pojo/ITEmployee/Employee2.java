package corejava.classesexample.pojo.ITEmployee;

public class Employee2 {
    private int id;
    private String name;
    private String department;
    private String address;


    public Employee2(int id){
        this.id = id;
    }
    public Employee2(int id , String name){
        this.id =id;
        this.name = name;
    }
    public Employee2(int id , String name, String department, String address ) {
        this(id, name);
        this.department = department;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    }


