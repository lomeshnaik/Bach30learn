package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IEmployeeDAO;

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
}
