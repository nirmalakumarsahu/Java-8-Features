package com.sahu.otherfunctionalinterfaces;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorTest {

	public static void main(String[] args) {
		IntUnaryOperator sumCal = i -> i * i;
		System.out.println(sumCal.applyAsInt(10));
	}
	
}
