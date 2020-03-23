//Test04_PredicateAutoboxing.java

import java.util.function.Predicate;

class Test04_PredicateAutoboxing {

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,15};
		Predicate<Integer> p = i -> i%2==0;
		for (int x1:x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
