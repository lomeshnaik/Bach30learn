package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IAdder;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry(6543);
        IAdder adder = (IAdder)registry.lookup("Adder");
        System.out.println("Add two Numbers---->" + adder.add(55,66));

    }
}
