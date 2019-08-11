package javalearn.Bach30.collection.impl;

import javalearn.Bach30.collection.IEmployeeDAO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements IEmployeeDAO {

    @Override
    public String[] [] getEmployeeList() {
        String employee[][] = {{"10", "Peter"},
                {"11", "sam"},
                {"12", "mark"},
                {"13", "suz"},
                {"14", "ray"}};

        return employee;
    }

    @Override
    public List getNames() {
        //String [] names ={"peter", "tom" ,"samy","hem", "yem"};
        //names[5] = "lome;";

        List<String> names = new ArrayList<>();
        names.add("peter");
        names.add("tom");
        names.add("samy");
        names.add("hem");
        names.add("yem");
        names.add(51444 + ""); //if  you want tp convert number or int into string use  + "" after integer

        return  names;
    }
}
