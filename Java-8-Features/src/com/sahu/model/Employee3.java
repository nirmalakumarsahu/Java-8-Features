package com.sahu.model;

public class Employee3 {
	private String name;
	private String designation;
	private Double salary;
	private String city;

	public Employee3(String name, String designation, Double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
	}

	@Override
	public boolean equals(Object obj) {
		Employee3 employee = (Employee3) obj;
		return (name.equals(employee.getName()) && designation.equals(employee.getDesignation())
				&& salary.equals(employee.getSalary()) && city.equals(employee.getCity())) ? true : false;
	}
}