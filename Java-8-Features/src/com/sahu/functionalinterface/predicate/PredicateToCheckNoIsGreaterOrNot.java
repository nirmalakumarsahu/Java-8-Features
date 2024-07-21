package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateToCheckNoIsGreaterOrNot {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i>10;
		System.out.println(predicate.test(100));
		System.out.println(predicate.test(5));
		//System.out.println(predicate.test("Durga"));
	}
	
}
