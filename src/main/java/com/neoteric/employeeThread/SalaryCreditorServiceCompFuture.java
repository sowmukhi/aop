package com.neoteric.employeeThread;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaryCreditorServiceCompFuture {
    public List<Employee> creditSalaryInRange(int startId, int endId) {
        List<Employee> creditedEmployees = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/employeethread";
        String user = "root";
        String password = "Sow@5555";

        String query = "SELECT emp_id, emp_name, sal FROM employeethread.emptable WHERE emp_id BETWEEN ? AND ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, startId);
            stmt.setInt(2, endId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                double sal = rs.getDouble("sal");

                System.out.println("Thread " + Thread.currentThread().getName() +
                        " credited salary ₹" + sal + " to employee " + name + " (ID: " + id + ")");

                creditedEmployees.add(new Employee(id, name, sal));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return creditedEmployees;
    }
}
