package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateJoiningTest {

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30};
		Predicate<Integer> predicate1 = i -> i>10;
		Predicate<Integer> predicate2 = i -> i%2==0;
		System.out.println("The numbes greater than 10 are: ");
		checkTheNumher(predicate1, x);
		System.out.println("The even numbers are: ");
		checkTheNumher(predicate2, x);
		System.out.println("The numbes not greater than 10 are: ");
		checkTheNumher(predicate1.negate(), x);
		System.out.println("The numbes greater than 10 and even are: ");
		checkTheNumher(predicate1.and(predicate2), x);
		System.out.println("The numbes greater than 10 or even are: ");
		checkTheNumher(predicate1.or(predicate2), x);
		
	}
	
	public static void checkTheNumher(Predicate<Integer> predicate, int[] x) {
		for (int i : x) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}
	}
}
