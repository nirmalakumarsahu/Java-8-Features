package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortMethods {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(5);
		numList.add(15);
		numList.add(25);
		System.out.println(numList);

		List<Integer> defaultNaturalSortingList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println(defaultNaturalSortingList);

		List<Integer> customizedSortingList = numList.stream().sorted((num1, num2) -> num2.compareTo(num1))
				.collect(Collectors.toList());
		System.out.println(customizedSortingList);
	}

}
