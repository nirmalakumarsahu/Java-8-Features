package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamsMinAndMaxMethods {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(5);
		numList.add(15);
		numList.add(25);
		System.out.println(numList);

		Integer minimumValue = numList.stream().min((num1, num2) -> num1.compareTo(num2)).get();
		System.out.println("Minimum value is - "+minimumValue);
		
		Integer maximumValue = numList.stream().min((num1, num2) -> num2.compareTo(num1)).get();
		System.out.println("Maximum value is - "+maximumValue);
	}

}
