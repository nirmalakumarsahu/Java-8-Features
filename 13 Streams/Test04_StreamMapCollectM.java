//Test04_StreamMapCollectM.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test04_StreamMapCollectM {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("nirmala");
		al.add("pabitra");
		al.add("papu");
		al.add("sameer");
		al.add("sibanda");
		al.add("muna");
		System.out.println(al);
		List<String> l = al.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);
	}

}
