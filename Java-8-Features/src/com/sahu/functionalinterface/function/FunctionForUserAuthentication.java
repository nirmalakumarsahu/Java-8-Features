package com.sahu.functionalinterface.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionForUserAuthentication {

	public static void main(String[] args) {
		Function<String, String> toMakeLowerCase = str -> str.toLowerCase();
		Function<String, String> toMakeSubString = str -> str.substring(0, 5);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String userName = scanner.next();
		
		System.out.print("Enter password: ");
		String password = scanner.next();
		
		if(toMakeLowerCase.andThen(toMakeSubString).apply(userName).equals("durga") && password.equals("java")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}

}
