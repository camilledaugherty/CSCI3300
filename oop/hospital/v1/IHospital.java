package oop.hospital.v1;

public interface IHospital{
    public String getWeb();
    public void addEmployee(IEmployee e);
    public String queryEmployees();
    public String queryEmployees(double min, double max);
    public String queryEmployees(String category);

}