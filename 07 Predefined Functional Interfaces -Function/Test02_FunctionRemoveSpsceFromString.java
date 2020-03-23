//Test02_FunctionRemoveSpsceFromString.java

import java.util.function.Function;

class Test02_FunctionRemoveSpsceFromString {

	public static void main(String[] args) {
		Function<String, String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply("Hello World!"));
		System.out.println(f.apply("N i r m a l a"));
	}

}
