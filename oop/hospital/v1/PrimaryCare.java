package oop.hospital.v1;

import java.time.LocalDate;

public class PrimaryCare extends HealthCare {

    public PrimaryCare(String ssn, String firstName, String lastName, LocalDate hireDate, double salary, boolean multilingual, Shift shift) {
        super(ssn, firstName, lastName, hireDate, salary, multilingual, shift);
    }
    
    @Override
    public double salaryIncrease() {
        //salary increase: 3.5% plus 0.5% for each quinquennial of service.
        double oldSalary = this.getSalary();
        double salaryIncrease = oldSalary*0.035; //salary increase will be added onto old salary, starts as 3.5% of old salary
        int serviceYears = this.yearsOfService();
        for(int i=4; i<serviceYears; i=i+5){ //for every 5 years the employee has worked (i starts as 4, if years are 5 or more 0.005 of old salary will be added on. iterates for every 5 years)
            salaryIncrease += oldSalary*0.005;
        }
        return salaryIncrease;
    }
}