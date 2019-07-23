package corejava.io;

import corejava.classesexample.pojo.Address;

import java.io.*;

public class ObjectOutPutStreamExample  {
    public static void main(String[] args) throws Exception {
        Address address =new Address();
        address.setAddress("address1");
        address.setAddress2("address2");
        address.setCountry("usa");
        address.setZip("4444");

//      ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream("address.dat"));
        //        outputStream.writeObject(address);
        //        outputStream.close();
        //
        //        System.out.println("Object is write successfully");
        //
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("address.dat"));
        address = (Address)objectInputStream.readObject();

        System.out.println(address.address);
        System.out.println(address.address2);
        System.out.println(address.country);
        System.out.println(address.zip);



}}





