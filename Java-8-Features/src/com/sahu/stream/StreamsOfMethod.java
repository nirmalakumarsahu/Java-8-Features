package com.sahu.stream;

import java.util.stream.Stream;

public class StreamsOfMethod {

	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.of(9, 99, 999, 9999, 99999);
		numStream.forEach(System.out::println);
		
		Double[] doubleArray = {10.0, 10.1, 10.2, 10.3, 10.4};
		Stream<Double> doubleStream = Stream.of(doubleArray);
		doubleStream.forEach(System.out::println);
	}

}
