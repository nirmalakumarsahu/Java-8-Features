package com.sahu.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateToCheckCollectionIsEmptyOrNot {

	public static void main(String[] args) {
		Predicate<Collection<?>> predicate = c -> c.isEmpty();
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		System.out.println(predicate.test(l1));
		ArrayList<String> l2 = new ArrayList<>();
		System.out.println(predicate.test(l2));
	}

}
