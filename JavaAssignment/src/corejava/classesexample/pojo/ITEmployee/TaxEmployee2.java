package corejava.classesexample.pojo.ITEmployee;


import corejava.classesexample.pojo.Address;

public class TaxEmployee2 extends Employee2 {
       // private int id;
    //private String name;
    //private String department;
   // private Address address;
    private String taxType;

    public TaxEmployee2(int id){
        super(id);
    }
    public TaxEmployee2(int id , String name){
        super(id,name);

    }
    public TaxEmployee2(int id , String name, String department, Address address ) {
        super(id, name);
        super.setDepartment(department);
        super.setAddress(address);
    }
    public TaxEmployee2(int id , String name, String taxType) {
        super(id, name);
        this.taxType= taxType;
    }
    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
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




