package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionToGetSquareOfNumber {

	public static void main(String[] args) {
		Function<Integer, Integer> squareOfNumber = num -> num * num;
		System.out.println(squareOfNumber.apply(5));
		System.out.println(squareOfNumber.apply(10));
	}
	
}
