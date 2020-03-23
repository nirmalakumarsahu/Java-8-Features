//Test10_FunctionUserAuthentication.java

import java.util.function.Function;
import java.util.Scanner;

class Test10_FunctionUserAuthentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name : ");
		String user = sc.next();
		System.out.print("Enter password : ");
		String pwd = sc.next();
		Function<String, String> f1 = s -> s.substring(0, 5);	
		Function<String, String> f2 = s -> s.toLowerCase();	
		if(f1.andThen(f2).apply(user).equals("nimus") && pwd.equals("nimu@123")) {
			System.out.println("Valid user");
		} else {
			System.out.println("In-valid user");
		}
	}

}
