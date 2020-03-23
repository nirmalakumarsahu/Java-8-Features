//Test03_PredicateCollectionEmpty.java

import java.util.function.Predicate;
import java.util.Collection;
import java.util.ArrayList;

class Test03_PredicateCollectionEmpty {

	public static void main(String[] args) {
		Predicate<Collection> p = c -> c.isEmpty();
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("nimu");
		System.out.println(p.test(al1));
		ArrayList<String> al2 = new ArrayList<>();
		System.out.println(p.test(al2));
	}
}
