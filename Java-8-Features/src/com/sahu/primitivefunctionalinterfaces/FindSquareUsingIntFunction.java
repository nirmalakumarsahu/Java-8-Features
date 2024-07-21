package com.sahu.primitivefunctionalinterfaces;

import java.util.function.IntFunction;

public class FindSquareUsingIntFunction {

	public static void main(String[] args) {
		IntFunction<Integer> findSquare = i -> i * i;
		System.out.println(findSquare.apply(5));
	}

}
