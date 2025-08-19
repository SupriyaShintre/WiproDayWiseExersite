package com.wipro.collection;

public class Employees {
    private String empId;
    private String empName;
    private double empSalary;

    public Employees(String empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - ₹" + empSalary;
    }
}

