//Test03_FunctionToCountSpsceOfString.java

import java.util.function.Function;

class Test03_FunctionToCountSpsceOfString {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length()-s.replaceAll(" ", "").length();
		System.out.println(f.apply("Hello World!"));
		System.out.println(f.apply("N i r m a l a"));
	}
 
}
