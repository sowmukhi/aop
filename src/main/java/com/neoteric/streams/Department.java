package com.neoteric.streams;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> empList;

    public Department(String name, List<Employee> empList) {
        this.name = name;
        this.empList = empList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
