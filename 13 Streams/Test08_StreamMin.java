//Test08_StreamMin.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test08_StreamMin {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(25);
		al.add(15);						
		al.add(5);
		al.add(20);
		System.out.println(al);
		Integer min = al.stream().min((i1, i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum values is : "+min);
	}

}
