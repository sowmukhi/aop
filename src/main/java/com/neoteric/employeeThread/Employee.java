package com.neoteric.employeeThread;

public class Employee {
    private int emp_id;
    private String emp_name;
    private double sal;

    public Employee(int emp_id, String emp_name, double sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.sal = sal;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
