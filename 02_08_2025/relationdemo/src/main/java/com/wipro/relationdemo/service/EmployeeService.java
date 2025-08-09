package com.wipro.relationdemo.service;

import com.wipro.relationdemo.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
