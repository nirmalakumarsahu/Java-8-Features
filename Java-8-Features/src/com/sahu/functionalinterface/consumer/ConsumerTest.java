package com.sahu.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = str -> System.out.println(str);
		consumer.accept("hello");
		consumer.accept("Webtech solution");
	}

}
