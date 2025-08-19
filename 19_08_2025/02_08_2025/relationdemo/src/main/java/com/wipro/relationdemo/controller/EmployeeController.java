package com.wipro.relationdemo.controller;

import com.wipro.relationdemo.entity.Employee;
import com.wipro.relationdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
    	return employeeService.saveEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
    	
        return employeeService.getAllEmployees();
    }
}
