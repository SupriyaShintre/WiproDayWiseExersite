package com.wipro.collection;

public class EmployeeTest {
	private String empId;
    private String empName;
    private int empAge;

    public EmployeeTest(String empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - " + empAge;
    }
}
