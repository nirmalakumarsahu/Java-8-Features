package com.sahu.otherfunctionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> sumCal = i -> i * i;
		System.out.println(sumCal.apply(10));
	}
	
}
