package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

import com.sahu.model.Employee3;

public class PredicateIsEqual {

	public static void main(String[] args) {
		Predicate<String> predicateIsEqual = Predicate.isEqual("WEBTECHSOLUTION");
		System.out.println(predicateIsEqual.test("WEBTECHSOLUTION"));
		System.out.println(predicateIsEqual.test("MALLIKA"));
		
		Predicate<Employee3> isCEO = Predicate.isEqual(new Employee3("Durga", "CEO", 300000.0, "Hyderbad"));
		Employee3 employee1 = new Employee3("Durga", "CEO", 300000.0, "Hyderbad");
		Employee3 employee2 = new Employee3("Sunny", "Manager", 20000.0, "Hyderbad");
		System.out.println(isCEO.test(employee1));
		System.out.println(isCEO.test(employee2));
	}
	
}
 