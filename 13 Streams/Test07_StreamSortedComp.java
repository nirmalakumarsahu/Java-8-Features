//Test07_StreamSortedComp.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test07_StreamSortedComp {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(25);
		al.add(15);						
		al.add(5);
		al.add(20);
		System.out.println(al);
		List<Integer> l = al.stream().sorted((i1, i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("List accoring to reverse of  defaulr natural sorting order : "+l);
	}

}
