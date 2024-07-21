package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollectMethod {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Pavan");
		nameList.add("RaviTeja");
		nameList.add("Chiranjeevi");
		nameList.add("Venkatesh");
		nameList.add("Nagarjuna");
		System.out.println(nameList);
		List<String> filteredNameList = nameList.stream().filter(name -> name.length() >= 9)
				.collect(Collectors.toList());
		System.out.println(filteredNameList);

		List<String> upperCaseNameList = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNameList);
	}

}
