package JavaLearn.Bach30.SpringBootJDBC.DAO.impl;

import JavaLearn.Bach30.SpringBootJDBC.DAO.IEmployeeDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith( SpringRunner.class )
@SpringBootTest
public class EmployeeDAOImplTest {

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
       System.out.println("First name = " + firstName);
        assertNotNull("FIRST NAME IS NULL", firstName);
       assertEquals("Georgi", firstName);

    }
    @Test
    public void fetchEmployeeWithFirstName() {
        iEmployeeDAO.fetchEmployeeWithFirstName("Test");
    }


    /*@Test
    public void getEmployeeDetails() throws Exception {
        Employee employeeDetails = iEmployeeDAO.getEmployeeDetails(10001);
        assertNotNull(employeeDetails);*/
}