package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionToRemoveSpacesFromString {

	public static void main(String[] args) {
		Function<String, String> removeSpacesFunction = str -> str.replaceAll(" ", "");
		System.out.println(removeSpacesFunction.apply("Webtech solution Hyderbad"));
	}

}