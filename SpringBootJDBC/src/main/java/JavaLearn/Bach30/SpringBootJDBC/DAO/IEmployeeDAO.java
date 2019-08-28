package JavaLearn.Bach30.SpringBootJDBC.DAO;

import JavaLearn.Bach30.SpringBootJDBC.domain.Employee;

import java.util.List;

public interface IEmployeeDAO  {
    String fetchFirstNameUsingId(int empId);
    List<Employee>fetchEmployeeWithFirstName(String firstName);

    Employee getEmployeeDetails(int empId);

}
