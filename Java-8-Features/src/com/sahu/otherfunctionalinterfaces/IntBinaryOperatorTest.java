
package com.sahu.otherfunctionalinterfaces;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorTest {

	public static void main(String[] args) {
		IntBinaryOperator sumCount = (num1, num2) -> num1 + num2;
		System.out.println(sumCount.applyAsInt(10, 20));
	}

}
