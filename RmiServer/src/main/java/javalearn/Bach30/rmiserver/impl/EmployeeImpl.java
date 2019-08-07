package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IEmployee;
import javalearn.Bach30.rmiserver.IEmployeeDAO;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EmployeeImpl extends UnicastRemoteObject implements IEmployee, Serializable {
    IEmployeeDAO iEmployeeDAO = new EmployeeDAOimpl();
    private static final long serialVersionID = 1L;

    public EmployeeImpl() throws RemoteException {
        super();
    }

    @Override
    public String getEmployeeWithId(int id) throws RemoteException {
        String name = null;

        String[][] employeeList = iEmployeeDAO.getEmployeeList();
        for (int i = 0; i <= employeeList.length; i++) {
            String[] idName = employeeList[i];
            if (Integer.parseInt(idName[0]) == id) {
                name = idName[1];
                break;
            }
        }
        return name;
    }
}
