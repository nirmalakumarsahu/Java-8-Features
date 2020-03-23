//Test15_BinaryOperator.java

import java.util.function.BinaryOperator;

class Test15_BinaryOperator {

	public static void main(String[] args) {
		BinaryOperator<String> o = (s1, s2) -> s1+s2;
		System.out.println(o.apply("Nimu", " sahu"));
	}
}
