package oop.hospital.v1;

import java.time.LocalDate;

public class Staff extends Employee {

    public Staff(String ssn, String firstName, String lastName, LocalDate hireDate, double salary, boolean multilingual) {
        super(ssn, firstName, lastName, hireDate, salary, multilingual);
    }
    
    @Override
    public double salaryIncrease() { //calculates salary increase
        //salary increase: 3.0% plus 0.3% for each triennial, plus 0.5% if the employee is multilingual.
        double oldSalary = this.getSalary();
        double salaryIncrease = oldSalary*0.03; //salary increase will be added onto old salary, starts as 3% of old salary
        int serviceYears = this.yearsOfService();
        for(int i=2; i<serviceYears; i=i+3){ //for every 3 years the employee has worked (i starts as 2, if years are 3 or more 0.003 of old salary will be added on. iterates for every 3 years)
            salaryIncrease += oldSalary*0.003;
        }
        if(this.getMultilingual() == true){
            salaryIncrease += oldSalary*0.005;
        }
        return salaryIncrease;
    }     
}