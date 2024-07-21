package com.sahu.otherfunctionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		BinaryOperator<String> concateString = (str1, str2) -> str1 + str2;
		System.out.println(concateString.apply("Webtect", "solution"));
	}

}
