package com.sahu.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sahu.model.Employee2;

public class CustomClassSortingLExTest {

	public static void main(String[] args) {
		List<Employee2> employees = new ArrayList<>();
		employees.add(new Employee2(200, "Deepika"));
		employees.add(new Employee2(400, "Sunny"));
		employees.add(new Employee2(300, "Mallika"));
		employees.add(new Employee2(100, "Katrina"));
		System.out.println("Before Sorting : " + employees);
		Collections.sort(employees,
				(e1, e2) -> e1.getEmpNo() < e2.getEmpNo() ? -1 : e1.getEmpNo() > e2.getEmpNo() ? 1 : 0);
		System.out.println("After Sorting : " + employees);
	}

}
