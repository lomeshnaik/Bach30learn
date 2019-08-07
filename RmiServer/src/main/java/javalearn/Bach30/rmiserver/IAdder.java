package javalearn.Bach30.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdder extends Remote {
   public int add(int x,int y)throws RemoteException;
}


