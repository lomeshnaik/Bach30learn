package corejava.classesexample.pojo.ITEmployee;



public class TaxEmployeeH2K extends H2KEmployee {
    // private int id;
    //private String name;
    //private String department;
    // private Address address;
    private String taxType;

    public TaxEmployeeH2K(int id) {
        super(id);
    }

    public TaxEmployeeH2K(int id, String name) {
        super(id, name);

    }

    public TaxEmployeeH2K(int id, String name, String department, String address) {
        super(id, name);
        super.setDepartment(department);
        super.setAddress(address);
    }

    public TaxEmployeeH2K(int id, String name, String taxType) {
        super(id, name);
        this.taxType = taxType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    @Override
    public void watchColor() {
        System.out.println("The watch color is BLACK and WHITE for Tax Employee");
    }

    public void tieColor() {
        System.out.println("The watch color is BLACK and white");
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




