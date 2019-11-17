package com.company;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Optional;
public class Employee  {
    protected String lastName;
    protected String firstName;
    protected double salary;
    protected int years;
    protected Optional<Manager> manager;


    public static class EmployeeBuilder{
        protected String lastName;
        protected String firstName;
        protected double salary;//узнать про тип
        protected int years;
        //protected int startOfWorkingYear;
        //protected Month startOfWorkingMonth;
        //protected int startOfWorkingDay;
        private Optional<Manager> manager;

        public EmployeeBuilder(int year, Month month, int dayOfMonth){
            LocalDate dateFrom = LocalDate.of(year,month,dayOfMonth);
            LocalDate dateTo = LocalDate.now();
            Period period = Period.between(dateFrom, dateTo);
            years = period.getYears();
        }
        public EmployeeBuilder(int years){
            this.years = years;
        }


        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public double getSalary() {
            return salary;
        }

        public EmployeeBuilder setSalary(double salary) {
            /*if(years > 5){
                this.salary = salary * 1.2 + 500;
            }
            else if (years > 2){
                this.salary = salary + 200;
            }
            else{
                this.salary = salary;
            }*/
            this.salary = salary;
            return this;
        }
        public int getYears(){
            return years;
        }

        public Optional<Manager> setManager(int years){
            return manager;
        }


        public EmployeeBuilder setManager(Manager manager){
            this.manager = Optional.of(manager);
            return this;
        }

        public Employee build(){
           /* if (name==null){
                throw new IllegalArgumentException("name is required field");
            }*/
            return new Employee(this);
        }
    }

    protected Employee(EmployeeBuilder employeeBuilder) {
        lastName = employeeBuilder.lastName;
        firstName = employeeBuilder.firstName;
        years = employeeBuilder.years;
        salary = employeeBuilder.salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
            this.salary = salary;
    }

    public int getYears() {
        return years;
    }
    public Optional<Manager> getManager() {
        return manager;
    }

    public void setManager(Optional<Manager> manager) {
        this.manager = manager ;
    }
    public void renewSalary(double salary){
        if(years > 5){
            this.salary = salary * 1.2 + 500;
        }
        else if (years > 2){
            this.salary = salary + 200;
        }
        else{
            this.salary = salary;
        }
    }
    @Override
    public String toString() {
        if(manager.isPresent()){
        return lastName + " " + firstName+ " " + "manager: "+ manager.get().lastName + " " + manager.get().firstName
                + "experience" + years;
        }
        return lastName + " " + firstName+ " " + "manager: "+"experience" + years;
    }
}
