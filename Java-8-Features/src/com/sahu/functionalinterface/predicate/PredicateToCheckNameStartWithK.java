package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateToCheckNameStartWithK {

	public static void main(String[] args) {
		String[] names = { "Sunny", "Kajal", "Malika", "Katrina", "Kareena" };
		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		System.out.println("The names start with K are: ");
		for (String name : names) {
			if (startsWithK.test(name)) {
				System.out.println(name);
			}
		}
	}

}
