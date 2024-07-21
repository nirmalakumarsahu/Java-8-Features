package com.sahu.Bifunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.sahu.model.Employee;

public class BiConsumerToIncrementEmployeeSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		BiFunction<String, Double, Employee> createEmployee = (name, salary) -> new Employee(name, salary);
		employees.add(createEmployee.apply("Durga", 1000.0));
		employees.add(createEmployee.apply("Sunny", 2000.0));
		employees.add(createEmployee.apply("Bunny", 3000.0));
		employees.add(createEmployee.apply("Chinny", 4000.0));

		BiConsumer<Employee, Double> incrementedSalary = (employee, incrementSal) -> employee
				.setSalary(employee.getSalary() + incrementSal);
		
		for (Employee emp : employees) {
			incrementedSalary.accept(emp, 500.0);
		}
		
		for (Employee emp : employees) {
			System.out.println("Name: " + emp.getName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println();
		}
	}

}
