package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<String, String> toMakeUppercase = str -> str.toUpperCase();
		Function<String, String> toMakeSubString = str -> str.substring(0, 9);
		System.out.println("The result of toMakeUppercase: "+toMakeUppercase.apply("Aishwaryaabhi"));
		System.out.println("The result of toMakeSubString: "+toMakeSubString.apply("Aishwaryaabhi"));
		System.out.println("The result of toMakeUppercase.andThen(toMakeSubString): "+toMakeUppercase.andThen(toMakeSubString).apply("Aishwaryaabhi"));
		System.out.println("The result of toMakeUppercase.compose(toMakeSubString): "+toMakeUppercase.compose(toMakeSubString).apply("Aishwaryaabhi"));
	}

}
