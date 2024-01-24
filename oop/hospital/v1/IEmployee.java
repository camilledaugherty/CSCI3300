package oop.hospital.v1;

import java.time.LocalDate;

public interface IEmployee{ //interface for employee class
    public String getSSN();
    public String getFirstName();
    public String getLastName();
    public LocalDate getHireDate();
    public double getSalary();
    public boolean getMultilingual();
    public int yearsOfService();
    public double salaryIncrease();
    public String toString();
}