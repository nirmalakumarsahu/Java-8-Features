package com.sahu.functionalinterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.sahu.model.Employee;

public class FunctionToCalculateMonthlySalaryOfAllEmployee {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		populateemployees(employees);
		Function<List<Employee>, Double> totalSalaryFunction = employeeList -> {
			double total = 0;
			for (Employee employee : employeeList) {
				total = total + employee.getSalary();
			}
			return total;
		};
		System.out.println("The total salry of this month : " + totalSalaryFunction.apply(employees));
	}

	private static void populateemployees(List<Employee> employees) {
		employees.add(new Employee("Sunny", 1000.0));
		employees.add(new Employee("Bunny", 2000.0));
		employees.add(new Employee("Chinny", 3000.0));
		employees.add(new Employee("Pinny", 4000.0));
		employees.add(new Employee("Vinny", 5000.0));
	}

}
