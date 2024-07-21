package com.sahu.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollectionCSODescLExTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10); 
		numList.add(0);
		numList.add(15); 
		numList.add(5); 
		numList.add(20); 
		System.out.println("Before Sorting: "+numList);
		Collections.sort(numList, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After Sorting: "+numList);
	}
	
}
