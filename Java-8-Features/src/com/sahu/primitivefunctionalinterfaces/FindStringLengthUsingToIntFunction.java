package com.sahu.primitivefunctionalinterfaces;

import java.util.function.ToIntFunction;

public class FindStringLengthUsingToIntFunction {

	public static void main(String[] args) {
		ToIntFunction<String> getLength = s -> s.length();
		System.out.println(getLength.applyAsInt("durga"));
	}

}
