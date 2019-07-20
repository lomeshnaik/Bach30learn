package corejava.classesexample.pojo.ITEmployee;

import corejava.classesexample.pojo.Address;

public class ITEmployeeH2K extends H2KEmployee {
    //private int id;
    // private String name;
    //private String department;
    // private Address address;
    private String programmingExperience;

    public ITEmployeeH2K(int id) {
        super(id);
    }

    public ITEmployeeH2K(int id, String name) {
        super(id, name);

    }

    public ITEmployeeH2K(int id, String name, String department, Address address) {
        this(id, name);
        super.setDepartment(department);
        super.setAddress(address);
    }

    public ITEmployeeH2K(int id, String name, String department, Address address, String experience) {
        this(id, name);
        super.setDepartment(department);
        super.setAddress(address);
        this.programmingExperience = experience;
    }

    public String getProgrammingExperience() {
        return programmingExperience;
    }

    public void setProgrammingExperience(String programmingExperience) {
        this.programmingExperience = programmingExperience;
    }

    @Override
    public void watchColor() {
        System.out.println("The watch color is BLACK and blue for IT Employee");
    }
@Override
    public void tieColor() {
        System.out.println("The watch color is BLACK");
    }
}

/*
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/






