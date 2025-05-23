package com.neoteric.employeeThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestForRangeTaskCompFuture {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ExecutorService customExecutor = Executors.newFixedThreadPool(5);
        SalaryCreditorServiceCompFuture service = new SalaryCreditorServiceCompFuture();

        List<CompletableFuture<List<Employee>>> futures = new ArrayList<>();

        // Submit 5 asynchronous tasks
        for (int i = 0; i < 5; i++) {
            int startId = 1 + i * 20;
            int endId = startId + 19;

            CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(
                    () -> service.creditSalaryInRange(startId, endId),
                    customExecutor
            );

            futures.add(future);
        }

        // Manually collect results from futures
        List<Employee> allEmployees = new ArrayList<>();

        for (CompletableFuture<List<Employee>> future : futures) {
            try {
                List<Employee> employees = future.get(); // blocking wait
                allEmployees.addAll(employees);
            } catch (ExecutionException e) {
                System.err.println("Error during salary crediting task: " + e.getMessage());
                e.printStackTrace();
            }
        }

        for (Employee e : allEmployees) {
            System.out.println("✔ Salary credited to: " + e.getEmp_name() + " (ID: " + e.getEmp_id() + ")");
        }

        customExecutor.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("\n Total execution time: " + (endTime - startTime) + " milliseconds");
    }
}
