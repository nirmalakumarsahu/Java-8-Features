package com.sahu.functionalinterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

import com.sahu.model.User;

public class PredicateToAuthenticationAnUser {

	public static void main(String[] args) {
		Predicate<User> predicateUser = user -> user.getUserName().equals("durga") && user.getPassword().equals("java");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username: ");
		String userName = scanner.next();
		System.out.print("Enter password: ");
		String password = scanner.next();
		User user = new User(userName, password);
		if (predicateUser.test(user)) {
			System.out.println("Valid user, you can get all services");
		} else {
			System.out.println("Invalid user, please login again");
		}

	}

}
