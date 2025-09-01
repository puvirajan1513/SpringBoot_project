package org.tnsif.springdi;

public class Employee {
    private String name;
    private Department department;
    private Company company;

    public Employee(String name, Department department, Company company) {
        this.name = name;
        this.department = department;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", " + department + ", " + company + "]";
    }
}
