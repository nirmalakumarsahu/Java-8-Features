//Test09_IntToDoubleFunction.java

import java.util.function.IntToDoubleFunction;

class Test09_IntToDoubleFunction {

	public static void main(String[] args) {  
		IntToDoubleFunction f = i -> Math.sqrt(i);
		System.out.println(f.applyAsDouble(5));
	}
}
