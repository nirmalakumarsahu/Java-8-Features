//Test05_PredicateNameStartWithK.java

import java.util.function.Predicate;

class Test05_PredicateNameStartWithK {

	public static void main(String[] args) {
		String[] names = {"Sunny", "kajal", "Malika", "katrina", "kareena"};
		Predicate<String> startWithK = str -> str.charAt(0)=='k';
		System.out.print("The name starts with K is : ");
		for (String s:names) {
			if(startWithK.test(s))
				System.out.print(s+", ");
		}
		System.out.println();
	}
}
