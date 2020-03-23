//Test06_IntPredicate.java

import java.util.function.IntPredicate;

class Test06_IntPredicate {

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,15};
		IntPredicate p = i -> i%2==0;
		for (int x1:x) {
			if (p.test(x1)) 
				System.out.println(x1);
		}
	}
}

//here no autoboxing or autounboxing