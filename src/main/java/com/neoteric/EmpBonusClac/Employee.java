package com.neoteric.EmpBonusClac;

public class Employee {
    private String name;
    private double baseSalary;
    private String performanceLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public void setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
    }

    public Employee(String name, double baseSalary, String performanceLevel) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.performanceLevel = performanceLevel;
    }
}
