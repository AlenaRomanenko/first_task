package com.company;

import java.math.BigDecimal;
import java.util.Date;

public class Developer extends Employee {
    public Developer(EmployeeBuilder employeeBuilder) {
        super(employeeBuilder);
        lastName = employeeBuilder.lastName;
        firstName = employeeBuilder.firstName;
        years = employeeBuilder.years;
        salary = employeeBuilder.salary;
    }
}
