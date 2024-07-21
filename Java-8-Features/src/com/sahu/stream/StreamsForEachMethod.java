package com.sahu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamsForEachMethod {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();
		wordList.add("A");
		wordList.add("BB");
		wordList.add("CCC");
		
		wordList.stream().forEach(str -> System.out.println(str));
		wordList.stream().forEach(System.out::println);
	}

}
