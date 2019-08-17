package javalearn.Bach30.CoreJDBC.impl;

import javalearn.Bach30.CoreJDBC.IEmployeeDAO;

import java.sql.*;

public class EmployeeDAOImpl implements IEmployeeDAO {
    public String fetchFirstNameUsingId(int empId) {
        String firstName = null;
// 1. download driver
        try {
            //   Driver driver = new Driver();
            //  DriverManager.registerDriver(driver);
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded....");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//2. set url for database msql
        String url = "jdbc:mysql://localhost:3306/employees";
//3. set connection
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, "lomeshnaik", "sunsin1983");
            System.out.println("connection established..... ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
// then query Statement
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select first_name from employees where emp_no=" + empId);
            while (resultSet.next()) {
                firstName = resultSet.getString("first_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(firstName);

            return firstName;
        }
    }
}
