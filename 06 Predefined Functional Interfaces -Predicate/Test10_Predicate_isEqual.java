//Test10_Predicate_isEqual.java

import java.util.function.Predicate;

class Test10_Predicate_isEqual {
	
	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("NIRMALA");
		System.out.println(p.test("NIRMALA"));
		System.out.println(p.test("NIMU"));
	}

}
