package corejava.classesexample.pojo;

import java.io.Serializable;

public class Address implements Serializable {
    public String address;// to use variable out side the pojo package ...the variable must public variable
    public String address2;
    public String zip;
    public String country;


    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



 //  public Address(String address){//, String address2, String zip, String country {
      // this.address = address;
        //this.address = address;
        //this.zip = zip
        //this.country = country;

    //}
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
