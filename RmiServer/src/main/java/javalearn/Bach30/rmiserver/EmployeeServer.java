package javalearn.Bach30.rmiserver;

import javalearn.Bach30.rmiserver.impl.EmployeeImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeServer {
    public static void main(String[] args) throws Exception {
        IEmployee iEmployee = new EmployeeImpl();
        Registry registry = LocateRegistry.createRegistry(2345);
        registry.rebind("employee",iEmployee);
        System.out.println("Server is up and Running........");


    }
}
