//Test13_UnaryOperator.java

import java.util.function.UnaryOperator;

class Test13_UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Integer> o = i -> i*i;
		System.out.println(o.apply(101));
	}
}
