package oop.hospital.v1;

import java.time.LocalDate;

public abstract class HealthCare extends Employee {
    private Shift shift;
        
    public HealthCare(String ssn, String firstName, String lastName, LocalDate hireDate, double salary, boolean multilingual, Shift shift) {
        super(ssn, firstName, lastName, hireDate, salary, multilingual);
        this.shift = shift;
    }
    
    public Shift getShift() { //returns shift enum
        return shift;
    }
    
    public void setShift(Shift shift) { //updates shift enum
        this.shift = shift;
    }    
}