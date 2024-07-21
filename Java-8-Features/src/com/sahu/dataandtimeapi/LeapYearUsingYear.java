package com.sahu.dataandtimeapi;

import java.time.Year;
import java.util.Scanner;

public class LeapYearUsingYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		int numYear = scanner.nextInt();
		Year year = Year.of(numYear);
		if (year.isLeap()) {
			System.out.printf("%d year is Leap year", numYear);
		}
		else {
			System.out.printf("%d year is not Leap year", numYear);
		}
	}
	
}
