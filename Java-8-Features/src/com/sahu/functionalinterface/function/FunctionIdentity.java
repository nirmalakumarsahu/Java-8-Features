package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionIdentity {

	public static void main(String[] args) {
		Function<String, String> functionIdentity = Function.identity();
		String result = functionIdentity.apply("durga");
		System.out.println(result);
	}

}
