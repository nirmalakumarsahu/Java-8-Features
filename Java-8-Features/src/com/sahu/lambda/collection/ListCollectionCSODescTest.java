package com.sahu.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollectionCSODescTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10); 
		numList.add(0);
		numList.add(15); 
		numList.add(5); 
		numList.add(20); 
		System.out.println("Before Sorting: "+numList);
		Collections.sort(numList, new MyComparator());
		System.out.println("After Sorting: "+numList);
	}
	
}
