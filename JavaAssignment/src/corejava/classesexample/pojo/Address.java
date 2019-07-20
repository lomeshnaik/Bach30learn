package corejava.classesexample.pojo;

public class Address {


    public String address;// to use variable out side the pojo package ...the variable must public variable
    public String address2;
    public String zip;
    public String country;

    public Address(String address){//, String address2, String zip, String country {
        this.address = address;
        //this.address = address;
        //this.zip = zip
        //this.country = country;

    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
