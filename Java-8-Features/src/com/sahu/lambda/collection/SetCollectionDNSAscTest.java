package com.sahu.lambda.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetCollectionDNSAscTest {

	public static void main(String[] args) {
		Set<Integer> numList = new TreeSet<>();
		numList.add(10);
		numList.add(0);
		numList.add(15);
		numList.add(25);
		numList.add(5);
		numList.add(20);
		System.out.println(numList);
	}

}
