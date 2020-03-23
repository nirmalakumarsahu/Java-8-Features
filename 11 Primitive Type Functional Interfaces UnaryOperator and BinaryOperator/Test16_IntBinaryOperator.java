//Test16_IntBinaryOperator.java

import java.util.function.IntBinaryOperator;

class Test16_IntBinaryOperator {

	public static void main(String[] args) {
		IntBinaryOperator o = (i1, i2) -> i1+i2;
		System.out.println(o.applyAsInt(10,20));
		System.out.println(o.applyAsInt(100,200));
	}
}
