package com.wipro.collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmployeesTest {
	 public static void main(String[] args) {
	        CopyOnWriteArrayList<Employees> employeeList = new CopyOnWriteArrayList<>();

	        employeeList.add(new Employees("E101", "Ankit", 75000));
	        employeeList.add(new Employees("E102", "Bhavesh", 82000));
	        employeeList.add(new Employees("E103", "Supriya", 95000));
	        employeeList.add(new Employees("E104", "Nikita", 70000));

//	        System.out.println("Original Employee List:");
//	        for (Employees emp : employeeList) {
//	            System.out.println(emp);
//	        }

	        for (Employees emp : employeeList) {
	            if (emp.getEmpSalary() > 80000) {
	                employeeList.remove(emp);
	            }
	        }

	        System.out.println("\nUpdated Employee List (After Removing >₹80000):");
	        for (Employees emp : employeeList) {
	            System.out.println(emp);
	        }
	    }

}
