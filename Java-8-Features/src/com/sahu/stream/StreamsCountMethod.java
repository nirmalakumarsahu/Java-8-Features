package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamsCountMethod {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Pavan");
		nameList.add("RaviTeja");
		nameList.add("Chiranjeevi");
		nameList.add("Venkatesh");
		nameList.add("Nagarjuna");
		System.out.println(nameList);
		Long count = nameList.stream().filter(name -> name.length() >= 9).count();
		System.out.println("The number of Strings whose length >= 9: " + count);
	}

}
