//Test03_StreamFilterCollectM.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test03_StreamFilterCollectM {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("nirmala");
		al.add("pabitra");
		al.add("papu");
		al.add("sameer");
		al.add("sibanda");
		al.add("muna");
		System.out.println(al);
		List<String> l = al.stream().filter(str->str.length()>=6).collect(Collectors.toList());
		System.out.println(l);
	}

}
