package com.company;

import java.math.BigDecimal;
import java.util.Date;


public class Designer extends Employee {
    private double effectivCoeff;//мб добавить в конструктор но надо узнать как)
    public Designer(EmployeeBuilder employeeBuilder, double effectivCoeff) {
        super(employeeBuilder);
        this.effectivCoeff = effectivCoeff;
        lastName = employeeBuilder.lastName;
        firstName = employeeBuilder.firstName;
        years = employeeBuilder.years;
        salary = employeeBuilder.salary * effectivCoeff;
    }
    public void renewSalary(double salary){
        super.renewSalary(salary);
        this.salary = salary * effectivCoeff;
    }

    public double getEffectivCoeff() {
        return effectivCoeff;
    }

    public void setEffectivCoeff(double effectivCoeff) throws CoeffException {
        if(effectivCoeff >0 & effectivCoeff<=1){
        this.effectivCoeff = effectivCoeff;
        }
        else{
            throw new CoeffException("You have entered wrong effectiveness coefficient ");
        }
    }

}
