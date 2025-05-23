package com.neoteric.employeeThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestForRangeTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis(); //  Start timing

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<List<Employee>>> futures = new ArrayList<>();

        // Submit 5 tasks, each processing 20 employees
        for (int i = 0; i < 5; i++) {
            int startId = 1 + i * 20;
            int endId = startId + 19;

            Callable<List<Employee>> task = new SalaryCreditorRangeTask(startId, endId);
            futures.add(executor.submit(task));
        }

        // Wait for all tasks and print summary
        for (Future<List<Employee>> future : futures) {
            List<Employee> employees = future.get();
            for (Employee e : employees) {
                System.out.println("✔ Salary credited to: " + e.getEmp_name() + " (ID: " + e.getEmp_id() + ")");
            }
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis(); // ⏱ End timing
        long duration = endTime - startTime;

        System.out.println("\n Total execution time: " + duration + " milliseconds");
    }
}