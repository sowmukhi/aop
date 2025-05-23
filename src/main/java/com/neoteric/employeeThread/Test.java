package com.neoteric.employeeThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws Exception{
        long startTime = System.currentTimeMillis(); // ⏱ Start timing

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Employee> task = new SalaryCreditorCallable(100); // Replace with desired emp_id
        Future<Employee> future = executor.submit(task);

        Employee creditedEmployee = future.get(); // Waits and gets result

        if (creditedEmployee != null) {
            System.out.println("Credit confirmed for employee: " + creditedEmployee.getEmp_name());
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis(); // ⏱ End timing
        long duration = endTime - startTime;

        System.out.println("\n⏱ Total execution time: " + duration + " milliseconds");
    }
}