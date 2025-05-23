package com.neoteric.employeeThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestForAllEmployeesUsingSingleThread {
    public static void main(String[] args) throws Exception{
        long startTime = System.currentTimeMillis(); // Start timing

        ExecutorService executor = Executors.newSingleThreadExecutor(); // Only 1 thread

        for (int empId = 1; empId <= 100; empId++) {
            Callable<Employee> task = new SalaryCreditorCallable(empId);
            Future<Employee> future = executor.submit(task);

            Employee creditedEmployee = future.get(); // Wait for result
            if (creditedEmployee != null) {
                System.out.println("Credit confirmed for: " +
                        creditedEmployee.getEmp_name() +
                        " (ID: " + creditedEmployee.getEmp_id() + ")");
            }
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis(); // End timing
        long duration = endTime - startTime;

        System.out.println("\n Salary credited to all employees using single thread.");
        System.out.println(" Total execution time: " + duration + " milliseconds");
    }
}