package com.sahu.primitivefunctionalinterfaces;

import java.util.function.IntPredicate;

public class IntPredicateTest {

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25 };
		IntPredicate intPredicate = num -> num % 2 == 0;
		
		for (int i : x) {
			if (intPredicate.test(i)) {
				System.out.println(i);
			}
		}
	}
	
}
