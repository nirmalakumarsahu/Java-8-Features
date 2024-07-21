package com.sahu.lambda.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> alphaMap = new HashMap<>();
		alphaMap.put("A","Apple");
		alphaMap.put("Z","Zebra");
		alphaMap.put("Durga","Java"); 
		alphaMap.put("B","Boy");
		alphaMap.put("T","Tiger"); 
		System.out.println(alphaMap);
	}

}
