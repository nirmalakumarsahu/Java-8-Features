package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenNumberFromListWithOutStreams {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(5);
		numList.add(15);
		numList.add(25);
		System.out.println(numList);

		List<Integer> evenList = new ArrayList<>();
		for (Integer num : numList) {
			if (num % 2 == 0) {
				evenList.add(num);
			}
		}
		System.out.println(evenList);
	}

}
