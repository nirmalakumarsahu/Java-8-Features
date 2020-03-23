//Test11_FucntionIdentity.java

import java.util.function.Function;

class Test11_FucntionIdentity {
	
	public static void main(String[] args) {
		Function<String, String> f = Function.identity();
		System.out.println(f.apply("Nimu"));
	}

}
