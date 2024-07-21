package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamsToArrayMethod {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(5);
		numList.add(15);
		numList.add(25);
		System.out.println(numList);

		Integer[] nums = numList.stream().toArray(Integer[]::new);
		for (Integer num : nums) {
			System.out.println(num);
		}
	}

}
