package com.neoteric.EmpBonusClac;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, "HIGH"),
                new Employee("Bob", 40000, "MEDIUM"),
                new Employee("Charlie", 45000, "LOW"),
                new Employee("David", 55000, "HIGH")
        );
        EmpService service = new EmpService();
        service.printBonusReport(employees);
    }
}
