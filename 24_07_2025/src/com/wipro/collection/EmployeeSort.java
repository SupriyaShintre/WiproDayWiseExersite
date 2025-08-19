package com.wipro.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E101", "Alice", 30, 50000));
        employees.add(new Employee("E102", "Bob", 25, 70000));
        employees.add(new Employee("E103", "Charlie", 28, 60000));

        Collections.sort(employees); 

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}