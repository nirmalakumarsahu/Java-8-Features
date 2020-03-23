//Test14_UnaryOperator.java

import java.util.function.IntUnaryOperator;

class Test14_IntUnaryOperator {

	public static void main(String[] args) {
		IntUnaryOperator o = i -> i*i;
		System.out.println(o.applyAsInt(10));
	}
}
