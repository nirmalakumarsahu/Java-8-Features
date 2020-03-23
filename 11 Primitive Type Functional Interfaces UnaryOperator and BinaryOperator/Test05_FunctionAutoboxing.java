//Test05_FunctionAutoboxing.java

import java.util.function.Function;

class Test05_FunctionAutoboxing {

	public static void main(String[] args) {  
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(10));
	}
}

/* This is the worest case because they are convert into
   primitive to warraper and wrapper to primitive so that
   to over from this problem primitve functional interface 
   come into feature.
*/