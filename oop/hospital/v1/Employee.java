package oop.hospital.v1;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee implements IEmployee { //abstract class -> cannot be instantiated, is only a base class to be inherited by subclasses
    private String ssn;
    private String firstName;
    private String lastName;
    private LocalDate hireDate;
    private double salary;
    private boolean multilingual;
    
    public Employee(String ssn, String firstName, String lastName, LocalDate hireDate, double salary, boolean multilingual) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
        this.multilingual = multilingual;
    }
    
    @Override
    public String getSSN() { //returns string of ssn
        return this.ssn;
    }
    
    @Override
    public String getFirstName() { //returns string of first name
        return this.firstName;
    }
    
    @Override
    public String getLastName() { //returns string of last name
        return this.lastName;
    }
    
    @Override
    public LocalDate getHireDate() { //returns LocalDate object of hire date
        return this.hireDate;
    }
    
    @Override
    public double getSalary() { //returns double of salary
        return this.salary;
    }

    @Override
    public boolean getMultilingual() { //returns true if multilingual, false if not
        return this.multilingual;
    }

    @Override
    public int yearsOfService() { //returns number of years of service
       LocalDate currentDate = LocalDate.now();
       Period timePeriod = Period.between(hireDate, currentDate);
       int years = timePeriod.getYears(); //number of years in between hire date and current date
       return years;
    }

    @Override
    public abstract double salaryIncrease(); //abstract method, so no body here (will be defined in subclass)

    @Override
    public String toString() {
        // returns a string with the data of the employee
        //how do i format string without printing it??? prob in hospital
        //string format function?
        String employeeData = String.format("-4%s\n",ssn);
        return employeeData;
    }
}