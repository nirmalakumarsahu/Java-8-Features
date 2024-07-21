package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionToCountSpacesFromString {

	public static void main(String[] args) {
		Function<String, Integer> countSpacesFunction = str -> str.length() - str.replaceAll(" ", "").length();
		System.out.println(countSpacesFunction.apply("Webtech solution Hyderbad"));
	}

}