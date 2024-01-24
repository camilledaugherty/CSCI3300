package oop.hospital.v1;

import java.time.LocalDate;

public class Nurse extends HealthCare {

    public Nurse(String ssn, String firstName, String lastName, LocalDate hireDate, double salary, boolean multilingual, Shift shift) {
        super(ssn, firstName, lastName, hireDate, salary, multilingual, shift);
    }
    
    @Override
    public double salaryIncrease(){ //calculates the salary increase
        //salary increase: 4.0% plus 0.3% for each triennial of service
        double oldSalary = this.getSalary();
        double salaryIncrease = oldSalary*0.04; //salary increase will be added onto old salary, starts as 4% of old salary
        int serviceYears = this.yearsOfService();
        for(int i=2; i<serviceYears; i=i+3){ //for every 3 years the employee has worked (i starts as 2, if years are 3 or more 0.003 of old salary will be added on. iterates for every 3 years)
            salaryIncrease += oldSalary*0.003;
        }
        return salaryIncrease;
    }    
}