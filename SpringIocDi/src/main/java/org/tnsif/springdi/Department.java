package org.tnsif.springdi;

public class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department [deptName=" + deptName + "]";
    }
}
