//Test08_FunctionChaining.java

import java.util.function.Function;

class Test08_FunctionChaining {
	
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		System.out.println("The Result of f1 :"+f1.apply("Aishwartaabji"));
		System.out.println("The Result of f2 :"+f2.apply("Aishwartaabji"));
		System.out.println("The Result of f1.andThen(f2) :"+f1.andThen(f2).apply("Aishwartaabji"));
		System.out.println("The Result of f1.compose(f2) :"+f1.compose(f2).apply("Aishwartaabji"));
	}

}
