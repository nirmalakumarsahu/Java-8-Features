//Test10_StreamForEach.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test10_StreamForEach {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("nirmala");
		al.add("pabitra");
		al.add("papu");
		al.add("sameer");
		al.add("sibanda");
		al.add("muna");
		System.out.println(al);
		System.out.println();
		al.stream().forEach(str->System.out.println(str));
		System.out.println();
		//method reference
		al.stream().forEach(System.out::println);
	}

}
