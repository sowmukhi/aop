package com.neoteric.EmpBonusClac;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class EmpService {
    Function<Employee, Double> calculateBonus = emp -> {
        String level = emp.getPerformanceLevel().toUpperCase();
        if (level.equals("HIGH")) return emp.getBaseSalary() * 0.20;
        if (level.equals("MEDIUM")) return emp.getBaseSalary() * 0.10;
        return 0.0;
    };
    public void printBonusReport(List<Employee> employees) {
        System.out.println("=== Employee Bonus Report ===");

        Consumer<Employee> printEmployee = emp -> {
            double bonus = calculateBonus.apply(emp);
            double total = emp.getBaseSalary() + bonus;
            System.out.printf("Name: %-10s | Base: %.2f | Bonus: %.2f | Total: %.2f%n",
                    emp.getName(), emp.getBaseSalary(), bonus, total);
        };

        employees.forEach(printEmployee);
    }
}
