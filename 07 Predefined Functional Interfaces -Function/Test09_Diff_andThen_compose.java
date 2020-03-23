//Test09_Diff_andThen_compose.java

import java.util.function.Function;

class Test09_Diff_andThen_compose {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i+i;
		Function<Integer, Integer> f2 = i -> i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

}

/* andThen:
--------------
first f1 execute then f2

compose:
--------------
first f2 execute then f1
*/