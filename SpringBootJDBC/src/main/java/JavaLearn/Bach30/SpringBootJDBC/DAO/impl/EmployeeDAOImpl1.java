package JavaLearn.Bach30.SpringBootJDBC.DAO.impl;

import JavaLearn.Bach30.SpringBootJDBC.DAO.IEmployeeDAO;
import JavaLearn.Bach30.SpringBootJDBC.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDAOImpl1 implements IEmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

     @Override
    public String fetchFirstNameUsingId(int empId) {
        String sql= "select first_name from employees where emp_no= ?";
         String firstName = jdbcTemplate.queryForObject(sql, new Object[]{empId}, String.class);
         return firstName;
    }

    @Override
    public List<Employee> fetchEmployeeWithFirstName(String firstName) {
//        String s = jdbcTemplate.queryForObject("select * from employees where first_name = ?", String.class);
//        System.out.println(s);

        return null;
    }

    @Override
    public Employee getEmployeeDetails(int empId) {
        return null;
    }

}
