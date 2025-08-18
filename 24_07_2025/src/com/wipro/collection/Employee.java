package com.wipro.collection;
import java.util.*;

class Employee implements Comparable<Employee> {
    String empId, empName;
    int empAge;
    double empSalary;

    Employee(String id, String name, int age, double salary) {
        empId = id;
        empName = name;
        empAge = age;
        empSalary = salary;
    }

    public int compareTo(Employee other) {
        if (this.empSalary > other.empSalary)
            return -1;
        else if (this.empSalary < other.empSalary)
            return 1;
        else
            return 0;
    }

    public String toString() {
        return empId + " - " + empName + " - " + empAge + " - " + empSalary;
    }
}