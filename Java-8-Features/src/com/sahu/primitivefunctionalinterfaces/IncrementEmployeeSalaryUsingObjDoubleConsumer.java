package com.sahu.primitivefunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

import com.sahu.model.Employee;

public class IncrementEmployeeSalaryUsingObjDoubleConsumer {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		populateEmployee(employees);
		
		ObjDoubleConsumer<Employee> incrementSalary = (employee, increment) -> employee.setSalary(employee.getSalary() + increment);
		
		for (Employee emp : employees) {
			incrementSalary.accept(emp, 500.0);
		}
		
		for (Employee emp : employees) {
			System.out.println("Employee Name: "+emp.getName());
			System.out.println("Employee Salary: "+emp.getSalary());
			System.out.println();
		}
	}
	
	public static void populateEmployee(List<Employee> employees) {
		employees.add(new Employee("Durga", 1000.0));
		employees.add(new Employee("Sunny", 2000.0));
		employees.add(new Employee("Bunny", 3000.0));
		employees.add(new Employee("Chinny", 4000.0));
	}
	
}
