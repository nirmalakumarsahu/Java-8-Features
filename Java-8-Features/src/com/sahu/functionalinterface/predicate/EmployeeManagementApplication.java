package com.sahu.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.sahu.model.Employee3;

public class EmployeeManagementApplication {

	public static void main(String[] args) {
		List<Employee3> employees = new ArrayList<>();
		populateEmployee3s(employees);
		System.out.println(employees);

		Predicate<Employee3> managerDesgPredicate = Employee3 -> Employee3.getDesignation().equals("Manager");
		System.err.println("\nEmployee3s who are Manager");
		displayEmployee(managerDesgPredicate, employees);

		Predicate<Employee3> bangaloreCityPredicate = Employee3 -> Employee3.getCity().equals("Bangalore");
		System.err.println("\nEmployee3s who are from Bangalore");
		displayEmployee(bangaloreCityPredicate, employees);

		Predicate<Employee3> salaryLessThan20000Predicate = Employee3 -> Employee3.getSalary() < 20000.0;
		System.err.println("\nEmployee3s whose salary is less than 20000");
		displayEmployee(salaryLessThan20000Predicate, employees);

		Predicate<Employee3> pinkSlipPredicate = managerDesgPredicate.and(bangaloreCityPredicate);
		System.err.println("\nEmployee3s who can get Pink slip");
		displayEmployee(pinkSlipPredicate, employees);

		System.err.println("\nEmployee3s who are manger or salary is less than 20000");
		displayEmployee(managerDesgPredicate.or(salaryLessThan20000Predicate), employees);

		System.err.println("\nEmployee3s who are not Manager");
		displayEmployee(managerDesgPredicate.negate(), employees);
	}

	public static void populateEmployee3s(List<Employee3> employees) {
		employees.add(new Employee3("Durga", "CEO", 300000.0, "Hyderbad"));
		employees.add(new Employee3("Sunny", "Manager", 20000.0, "Hyderbad"));
		employees.add(new Employee3("Mallika", "Manager", 20000.0, "Bangalore"));
		employees.add(new Employee3("Kareena", "Lead", 15000.0, "Hyderbad"));
		employees.add(new Employee3("Katrina", "Lead", 15000.0, "Bangalore"));
		employees.add(new Employee3("Anushka", "Developer", 10000.0, "Hyderbad"));
		employees.add(new Employee3("Kanushka", "Developer", 10000.0, "Hyderbad"));
		employees.add(new Employee3("Soumya", "Developer", 10000.0, "Bangalore"));
		employees.add(new Employee3("Ramya", "Developer", 10000.0, "Bangalore"));
	}

	public static void displayEmployee(Predicate<Employee3> empPredicate, List<Employee3> employees) {
		for (Employee3 employee : employees) {
			if (empPredicate.test(employee)) {
				System.out.println(employee);
			}
		}
	}

}
