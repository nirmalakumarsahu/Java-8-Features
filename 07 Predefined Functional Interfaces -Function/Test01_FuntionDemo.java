//Test01_FuntionDemo.java

import java.util.function.Function;

class Test01_FuntionDemo {
	
	public static void main(String[] args) {
		Function<String, Integer> f1 = str -> str.length();
		System.out.println(f1.apply("Nimu"));
		System.out.println(f1.apply("Nimu Sahu"));
		Function<Integer, Integer> f2 = i -> i*i;
		System.out.println(f2.apply(5));
		System.out.println(f2.apply(10));
	}
}
