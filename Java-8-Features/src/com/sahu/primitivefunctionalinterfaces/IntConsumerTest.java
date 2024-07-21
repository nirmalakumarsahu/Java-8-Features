package com.sahu.primitivefunctionalinterfaces;

import java.util.function.IntConsumer;

public class IntConsumerTest {

	public static void main(String[] args) {
		IntConsumer displayConsumer = num -> System.out.println("The square is - "+(num * num));
		displayConsumer.accept(5);
	}
	
}
