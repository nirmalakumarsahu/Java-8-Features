//Test09_SortOurOwnClassObjWithLEx.java

import java.util.ArrayList;
import java.util.Collections;

class Test09_SortOurOwnClassObjWithLEx {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(200, "Deepika"));
		al.add(new Employee(400, "Sunny"));
		al.add(new Employee(300, "Malika"));
		al.add(new Employee(100, "Katrina"));
		System.out.println("Before Sorting : "+al);
		Collections.sort(al, (e1, e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?+1:0);
		System.out.println("After Sorting : "+al);
	}

}
