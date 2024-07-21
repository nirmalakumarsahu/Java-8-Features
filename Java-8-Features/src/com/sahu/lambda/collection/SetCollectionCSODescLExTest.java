package com.sahu.lambda.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetCollectionCSODescLExTest {

	public static void main(String[] args) {
		Set<Integer> numList = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		numList.add(10);
		numList.add(0);
		numList.add(15);
		numList.add(25);
		numList.add(5);
		numList.add(20);
		System.out.println(numList);
	}

}