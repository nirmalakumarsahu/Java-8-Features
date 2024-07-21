package com.sahu.functionalinterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sahu.model.Employee;

public class EmployeeSalaryIncrement {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		populateemployees(employees);
		System.out.println("Before Increment:");
		System.out.println(employees);

		Predicate<Employee> eligiableForIncrement = employee -> employee.getSalary() < 3500;
		Function<Employee, Employee> updatedEmployeeSalary = employee -> {
			employee.setSalary(employee.getSalary() + 477.0);
			return employee;
		};

		List<Employee> updatedEmployees = new ArrayList<>();
		for (Employee emp : employees) {
			if (eligiableForIncrement.test(emp)) {
				updatedEmployeeSalary.apply(emp);
				updatedEmployees.add(emp);
			}
		}
		System.out.println("After increment:");
		System.out.println(updatedEmployees);
	}

	private static void populateemployees(List<Employee> employees) {
		employees.add(new Employee("Sunny", 1000.0));
		employees.add(new Employee("Bunny", 2000.0));
		employees.add(new Employee("Chinny", 3000.0));
		employees.add(new Employee("Pinny", 4000.0));
		employees.add(new Employee("Vinny", 5000.0));
	}
}
