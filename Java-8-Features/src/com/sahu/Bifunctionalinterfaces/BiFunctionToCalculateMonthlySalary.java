package com.sahu.Bifunctionalinterfaces;

import java.util.function.BiFunction;

import com.sahu.model.Employee4;
import com.sahu.model.Timesheet;

public class BiFunctionToCalculateMonthlySalary {

	public static void main(String[] args) {
		Employee4 employee = new Employee4(101, "Durga", 1500.0);
		Timesheet timesheet = new Timesheet(101, 25);
		BiFunction<Employee4, Timesheet, Double> calculateMonthlySalary = (emp, times) -> emp.getDailyWage() * times.getDayas();
		System.out.println(calculateMonthlySalary.apply(employee, timesheet));
	}
	
}
