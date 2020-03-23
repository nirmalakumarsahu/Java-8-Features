//Test11_StreamToArray.java

import java.util.ArrayList;
import java.util.List;

class Test11_StreamToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		Integer[] array = al.stream().toArray(Integer[]::new);
		for (Integer x:array){
			System.out.println(x);
		}
	}

}
