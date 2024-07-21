package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateToCheckStringLengthIsGreaterOrNot {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 5;
		System.out.println(predicate.test("abcdef"));
		System.out.println(predicate.test("abc"));
	}

}
