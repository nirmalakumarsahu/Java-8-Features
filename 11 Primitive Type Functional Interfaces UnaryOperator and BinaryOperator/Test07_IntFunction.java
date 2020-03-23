//Test07_IntFunction.java

import java.util.function.IntFunction;

class Test07_IntFunction {

	public static void main(String[] args) {  
		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(10));
	}
}
