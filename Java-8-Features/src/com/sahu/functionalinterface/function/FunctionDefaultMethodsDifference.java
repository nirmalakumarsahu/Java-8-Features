package com.sahu.functionalinterface.function;

import java.util.function.Function;

public class FunctionDefaultMethodsDifference {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleOfNumber = num -> num + num;
		Function<Integer, Integer> cubeOfNumber = num -> num * num * num;
		System.out.println(doubleOfNumber.apply(2));
		System.out.println(cubeOfNumber.apply(2));
		System.out.println(doubleOfNumber.andThen(cubeOfNumber).apply(2));
		System.out.println(doubleOfNumber.compose (cubeOfNumber).apply(2));
	}

}
