package oop.hospital.v1;

import java.util.ArrayList;
import java.lang.String;

public class Hospital implements IHospital{
    private String siteName;
    ArrayList<IEmployee> employeeList;

    public Hospital(String name){
        this.siteName = name;
        employeeList = new ArrayList<IEmployee>();

    }
   
    public String getWeb(){ //returns site name
        return siteName;
    }

    public void addEmployee(IEmployee e){ //adds any type of employee to the list
        employeeList.add(e);
    }

    public String queryEmployees(){
        String titleString = String.format("%-30sEmployee List\n",siteName);
        for(int i=0; i<employeeList.size(); i++){
            IEmployee employee = employeeList.get(i);
            String employeeName = String.format("%s, %s",employee.getLastName(),employee.getFirstName());
            String years = Integer.toString(employee.yearsOfService())+" years";
            String language = "English";
            if(employee.getMultilingual()==true){
                language = "Multilingual";
            }
            String salary = employee.getSalary()+" eur.";
            String ourClass = employee.getClass().getSimpleName(); //use get class method to tell the category of the employee
            String salaryIncrease = String.format("Salary increase %.2f eur.",employee.salaryIncrease());
            String employeeString = String.format("%-4s%-20s%-10s%s  %-13s%-13s%s",employee.getSSN(),employeeName,years,salary,language,ourClass,salaryIncrease);
            titleString = String.format("%s\n%s",titleString,employeeString);
        }
        titleString = titleString + "\n";
        return titleString;
    }

    public String queryEmployees(double min, double max){
        String rangeString = min+" and "+max;
        String titleString = String.format("%-30sEmployees having a salary between %s\n",siteName,rangeString);
        for(int i=0; i<employeeList.size(); i++){
            IEmployee employee = employeeList.get(i);
            if(min<=employee.getSalary() && employee.getSalary()<=max){ //if employee in our list has a salary in the provided range, add to our string
                String employeeName = String.format("%s, %s",employee.getLastName(),employee.getFirstName());
                String years = Integer.toString(employee.yearsOfService())+" years";
                String language = "English";
                if(employee.getMultilingual()==true){
                    language = "Multilingual";
                }
                String salary = employee.getSalary()+" eur.";
                String ourClass = employee.getClass().getSimpleName(); //use get class method to tell the category of the employee
                String salaryIncrease = String.format("Salary increase %.2f eur.",employee.salaryIncrease());
                String employeeString = String.format("%-4s%-20s%-10s%s  %-13s%-13s%s",employee.getSSN(),employeeName,years,salary,language,ourClass,salaryIncrease);
                titleString = String.format("%s\n%s",titleString,employeeString);
            } //if salary is out of range, do nothing
        }
        titleString = titleString + "\n";
        return titleString;
    }
    public String queryEmployees(String category){
        String titleString = String.format("%-30sEmployees: %s\n",siteName,category);
        for(int i=0; i<employeeList.size(); i++){
            IEmployee employee = employeeList.get(i);
            if((employee.getClass().getSimpleName()).equals(category)){ //if the class name of the given employee matches the category, add to string
                String employeeName = String.format("%s, %s",employee.getLastName(),employee.getFirstName());
                String years = Integer.toString(employee.yearsOfService())+" years";
                String language = "English";
                if(employee.getMultilingual()==true){
                    language = "Multilingual";
                }
                String salary = employee.getSalary()+" eur.";
                String ourClass = employee.getClass().getSimpleName(); //use get class method to tell the category of the employee
                String salaryIncrease = String.format("Salary increase %.2f eur.",employee.salaryIncrease());
                String employeeString = String.format("%-4s%-20s%-10s%s  %-13s%-13s%s",employee.getSSN(),employeeName,years,salary,language,ourClass,salaryIncrease);
                titleString = String.format("%s\n%s",titleString,employeeString);
            } //if category does not match class, do nothing
        }
        titleString = titleString + "\n";
        return titleString;
    }
}