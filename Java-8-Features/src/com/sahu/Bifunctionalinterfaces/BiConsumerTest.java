package com.sahu.Bifunctionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		BiConsumer<String, String> concateString = (str1, str2) -> System.out.println(str1 + str2);
		concateString.accept("webtech", "solution");
	}

}
