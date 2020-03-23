//Test06_StreamSorted.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test06_StreamSorted {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(25);
		al.add(15);						
		al.add(5);
		al.add(20);
		System.out.println(al);
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		System.out.println("List accoring to defaulr natural sorting order : "+l);
	}

}
