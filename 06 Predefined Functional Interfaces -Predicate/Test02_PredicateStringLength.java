//Test02_PredicateStringLength.jav

import java.util.function.Predicate;

class Test02_PredicateStringLength {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.length()>5;
		System.out.println(p.test("Hello World!"));
		System.out.println(p.test("Hii"));
	}

}
