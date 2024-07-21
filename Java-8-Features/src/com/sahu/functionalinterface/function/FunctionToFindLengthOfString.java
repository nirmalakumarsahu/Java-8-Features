package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionToFindLengthOfString {

	public static void main(String[] args) {
		Function<String, Integer> findLengthOfString = str -> str.length();
		System.out.println(findLengthOfString.apply("durga"));
		System.out.println(findLengthOfString.apply("WEBTECHSOLUTION"));
	}

}
