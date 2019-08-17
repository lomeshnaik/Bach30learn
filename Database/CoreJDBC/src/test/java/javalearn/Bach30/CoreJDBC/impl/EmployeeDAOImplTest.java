package javalearn.Bach30.CoreJDBC.impl;

import javalearn.Bach30.CoreJDBC.IEmployeeDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDAOImplTest {
    private IEmployeeDAO iEmployeeDAO;

    @Before
    public void setUp() throws Exception {
        iEmployeeDAO = new EmployeeDAOImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fetchFirstNameUsingIdTest() throws Exception {
        String firstName = iEmployeeDAO.fetchFirstNameUsingId(10016);
        assertNotNull(firstName);

    }
}