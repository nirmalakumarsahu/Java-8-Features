//Test06_PredicateRemoveNullVale_EmptyString.java

import java.util.ArrayList;
import java.util.function.Predicate;

class Test06_PredicateRemoveNullVale_EmptyString {

	public static void main(String[] args) {
		String[] names = {"Sunny", "", null, "Ravi", "", "Shiva", null};
		Predicate<String> removeNVES = str -> str!=null && str.length()!=0;
		ArrayList<String> al = new ArrayList<>();
		System.out.print("After removing null and Empty String  : ");
		for (String s:names) {  
			if(removeNVES.test(s))
				al.add(s); 
		}
		System.out.println(al);
	}
}
