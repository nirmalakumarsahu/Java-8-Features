package com.sahu.lambda.collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionTest {
	
	public static void main(String[] args) {
		Set<String> nameList = new HashSet<>();
		nameList.add("Sunny");
		nameList.add("Bunny");
		nameList.add("Chinny");
		nameList.add("Sunny");
		System.out.println(nameList);
	}
	
}
