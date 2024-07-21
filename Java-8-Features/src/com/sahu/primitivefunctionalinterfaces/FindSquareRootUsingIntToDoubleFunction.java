package com.sahu.primitivefunctionalinterfaces;

import java.util.function.IntToDoubleFunction;

public class FindSquareRootUsingIntToDoubleFunction {

	public static void main(String[] args) {
		IntToDoubleFunction findSquareRoot = i -> Math.sqrt(i);
		System.out.println(findSquareRoot.applyAsDouble(9));
	}

}
