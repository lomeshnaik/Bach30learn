package JavaLearn.Bach30.SpringBootJDBC.DAO.impl;

import JavaLearn.Bach30.SpringBootJDBC.DAO.IEmployeeDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDAOImplTest1 {

    @Autowired
    IEmployeeDAO iEmployeeDAO;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fetchFirstNameUsingId() {
        String firstName = iEmployeeDAO.fetchFirstNameUsingId(10001);
    }
}