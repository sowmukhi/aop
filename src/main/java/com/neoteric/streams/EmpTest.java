package com.neoteric.streams;

import java.util.ArrayList;
import java.util.List;

public class EmpTest {
    public static void main(String[] args) {

        List<Employee> itEmployeeList = new ArrayList<>();
        Employee emp1 = new Employee("Lavanya");
        Employee emp2 = new Employee("srinivas");
        itEmployeeList.add(emp1);
        itEmployeeList.add(emp2);
        Department itDept = new Department("IT",itEmployeeList);

        List<Employee> hrEmployeeList = new ArrayList<>();
        Employee emp3 = new Employee("lakshmi");
        Employee emp4 = new Employee("sowmukhi");
        hrEmployeeList.add(emp3);
        hrEmployeeList.add(emp4);
        Department hrDept = new Department("HR",hrEmployeeList);

        List<Department> deptList = new ArrayList<>();
        deptList.add(itDept);
        deptList.add(hrDept);

        long count = deptList.stream()
                .flatMap(dept -> dept.getEmpList().stream())
                .count();

        System.out.println(count);
    }
}
