package com.company;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Manager extends Employee {
    public Manager(EmployeeBuilder employeeBuilder) {
        super(employeeBuilder);
        lastName = employeeBuilder.lastName;
        firstName = employeeBuilder.firstName;
        years = employeeBuilder.years;
        salary = employeeBuilder.salary;
    }
    List<? extends Employee> team;
    public void renewSalary(double salary){
        super.renewSalary(salary);
        long count = team.stream()
                .filter(i -> i instanceof Developer)
                .count();
        if(count >team.size() /2){
            this.salary = salary *1.1;
        }
        else if(team.size()>10){
            this.salary = salary + 300;

        }
        else if(team.size()>5){
            this.salary = salary + 200;

        }
        else{
            this.salary = salary;
        }
    }

}
