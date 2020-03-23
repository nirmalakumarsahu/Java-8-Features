//Test01_Predicate.java

import java.util.function.Predicate;

class Test01_Predicate {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
	//	System.out.println(p.test("Nimu")); //CE:incompatible types: String cannot be converted to Integer
	}

}
