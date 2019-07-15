package corejava.classesexample.pojo.ITEmployee;

import corejava.classesexample.pojo.Address;

public class ITEmployee2 extends Employee2 {
    //private int id;
    // private String name;
    //private String department;
    // private Address address;
    private String programmingExperience;

    public ITEmployee2(int id) {
        super(id);
    }

    public ITEmployee2(int id, String name) {
        super(id, name);

    }

    public ITEmployee2(int id, String name, String department, String address) {
        this(id, name);
        super.setDepartment(department);
        super.setAddress(address);
    }
        public ITEmployee2(int id, String name, String department, String address,String experience) {
            this(id, name);
            super.setDepartment(department);
            super.setAddress(address);
            this.programmingExperience =experience;
    }

    public String getProgrammingExperience() {
        return programmingExperience;
    }

    public void setProgrammingExperience(String programmingExperience) {
        this.programmingExperience = programmingExperience;
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






