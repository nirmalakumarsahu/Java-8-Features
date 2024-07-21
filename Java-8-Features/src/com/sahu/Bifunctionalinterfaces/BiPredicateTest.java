package com.sahu.Bifunctionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkTheSum = (a, b) -> (a + b) % 2 == 0;
		System.out.println(checkTheSum.test(10, 20));
		System.out.println(checkTheSum.test(15, 20));
	}
}
