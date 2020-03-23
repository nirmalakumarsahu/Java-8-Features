//Test05_StreamFilterCountM.java

import java.util.ArrayList;
import java.util.List;
 
class Test05_StreamFilterCountM {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("nirmala");
		al.add("pabitra");
		al.add("papu");
		al.add("sameer");
		al.add("sibanda");
		al.add("muna");
		System.out.println(al);
		long count = al.stream().filter(str->str.length()>=6).count();
		System.out.println("The no of Strings whose length >=6 : "+count);
	}

}
