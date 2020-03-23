//Test07_PredicateUserAuthentication.java

import java.util.function.Predicate;
import java.util.Scanner;

class User {
	String username;
	String password;
	
	User(String username, String password) {
		this.username=username;
		this.password=password;
	}
}


class Test07_PredicateUserAuthentication {

	public static void main(String[] args) {

		Predicate<User> p= user -> user.username.equals("Nimu") && user.password.equals("Nimu@123");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Name : ");
		String username=sc.next();
		System.out.print("Enter Password : ");
		String password=sc.next();
		User user = new User(username, password);
		if(p.test(user)) {
			System.out.println("Valid user");
		} else {
			System.out.println("Invalid user");
		}

	}
}

