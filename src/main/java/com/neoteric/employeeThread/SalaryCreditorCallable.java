package com.neoteric.employeeThread;

import java.sql.*;
import java.util.concurrent.Callable;

public class SalaryCreditorCallable implements Callable<Employee> {
    private int empId;

    public SalaryCreditorCallable(int empId) {
        this.empId = empId;
    }

    @Override
    public Employee call() throws Exception {
        String url = "jdbc:mysql://localhost:3306/employeethread";
        String user = "root";
        String password = "Sow@5555"; // replace with actual password

        String query = "SELECT emp_name, sal FROM employeethread.emptable WHERE emp_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, empId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("emp_name");
                double salary = rs.getDouble("sal");

                // Simulate salary credit
                System.out.println("Credited salary ₹" + salary + " to employee " + name + " (ID: " + empId + ")");

                // Return the employee object
                return new Employee(empId, name, salary);
            } else {
                System.out.println("Employee with ID " + empId + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
