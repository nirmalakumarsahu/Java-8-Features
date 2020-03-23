//Test02_HashSet.java

import java.util.HashSet;

class Test02_HashSet {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Sunny");
		hs.add("Bunny");
		hs.add("Chinny");
		hs.add("Munny");
		hs.add("Sunny");
		System.out.println(hs);
	}

}

