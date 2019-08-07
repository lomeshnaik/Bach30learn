package javalearn.Bach30.rmiserver;

import javalearn.Bach30.rmiserver.impl.AdderRemoteImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderServer {

    public static void main(String[] args) throws RemoteException {
        IAdder iAdder = new AdderRemoteImpl();
        Registry registry = LocateRegistry.createRegistry(6543);
        registry.rebind("Adder", iAdder);
        System.out.println("Server Up and Running.............");

    }
}
