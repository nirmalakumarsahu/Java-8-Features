package com.sahu.Bifunctionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a * b;
		System.out.println(bifunction.apply(10, 20));
		System.out.println(bifunction.apply(100, 200));
	}

}
