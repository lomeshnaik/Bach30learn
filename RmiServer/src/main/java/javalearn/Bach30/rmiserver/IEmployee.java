package javalearn.Bach30.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployee extends Remote {
    public String getEmployeeWithId(int id) throws RemoteException;
}
