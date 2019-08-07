package javalearn.Bach30.rmiserver.impl;

import javalearn.Bach30.rmiserver.IEmployee;
import org.junit.Test;
import static org.junit.Assert.*;

    public class EmployeeImplTest {

        @Test
    public void getEmployeeWithIdTest () throws Exception {
        IEmployee employee = new EmployeeImpl();
        String employeeNameWithId = employee.getEmployeeWithId(10);
        assertEquals("Peter",employeeNameWithId);

    }

}