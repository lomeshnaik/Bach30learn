package javalearn.Bach30.rmiserver.impl;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EmployeeDAOimplTest {
    private EmployeeDAOimpl employeeDAO = new EmployeeDAOimpl();

    @Test
    public void getEmployeeListTest() throws Exception {
        String[][] employeeList = employeeDAO.getEmployeeList();
        assertNotNull(employeeList);

    }
}