package javaLearn.Bach30.Collection;

import javalearn.Bach30.collection.impl.EmployeeDAOimpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class EmployeeDAOimplTest {
    private EmployeeDAOimpl employeeDAO = new EmployeeDAOimpl();

    @Test
    public void getEmployeeListTest() throws Exception {
        String[][] employeeList = employeeDAO.getEmployeeList();
        assertNotNull(employeeList);
    }

    @Test
    public void getNameTest() throws  IndexOutOfBoundsException {
        List<String> names = employeeDAO.getNames();
        names.add("lomesh");
        System.out.println(names);
        System.out.println(names.size());

       /* for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
*/
       for (String name : names){ //Enhence Looping
           System.out.println(name);
    }
       names.remove("yem");
       names.forEach(System.out::println); //Advance looping
        System.out.println(names.size());

        names.clear();
       // names.forEach(System.out::println); //Advance looping
        System.out.println(names.size()+ "After clear Array");

    assertNotNull(names);

    }
}