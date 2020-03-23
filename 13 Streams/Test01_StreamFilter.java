//Test01_StreamFilter.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test01_StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
	}

}
