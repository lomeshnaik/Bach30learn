package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IEmployee;
import org.junit.Test;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeClient {
    //public static void main(String[] args) throws Exception{
    @Test
    public void employeeClientTest() throws Exception {
        Registry registry = LocateRegistry.getRegistry(2345);
        IEmployee employee =(IEmployee)registry.lookup("employee");
        String employeeWithId = employee.getEmployeeWithId(12);
        System.out.println(employeeWithId);

    }
}
