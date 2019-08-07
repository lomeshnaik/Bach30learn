package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IAdder;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemoteImpl extends UnicastRemoteObject implements IAdder {
    public AdderRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return (x+y);
    }
}
