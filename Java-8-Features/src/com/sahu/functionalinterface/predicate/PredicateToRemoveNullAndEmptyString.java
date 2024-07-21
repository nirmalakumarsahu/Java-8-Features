package com.sahu.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToRemoveNullAndEmptyString {

	public static void main(String[] args) {
		String[] names = { "Durga", " ", null, "Ravi", "", "Shiva", null };
		Predicate<String> predicate = s -> s!=null && !s.isEmpty();
		List<String> nameList = new ArrayList<>();
		for (String name : names) {
			if(predicate.test(name)) {
				nameList.add(name);
			}
		}
		System.out.println("The list of valid names");
		System.out.println(nameList);
	}

}
