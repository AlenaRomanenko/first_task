package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Department {
    List<Manager> managers;
    public void giveSalary(Employee employee){
        employee.renewSalary(employee.salary);
        System.out.println(employee.firstName + employee.lastName + ": got salary: + " + employee.salary);
    }
}
