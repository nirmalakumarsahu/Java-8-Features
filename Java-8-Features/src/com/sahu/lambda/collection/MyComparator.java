package com.sahu.lambda.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
	}

}
