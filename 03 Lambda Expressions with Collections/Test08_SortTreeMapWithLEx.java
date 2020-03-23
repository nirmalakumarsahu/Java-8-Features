//Test08_SortTreeMapWithLEx.java

import java.util.TreeMap;

class Test08_SortTreeMapWithLEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>((i1,i2) -> (i1>i2)?-1:(i1<i2)?+1:0);
		tm.put(10, "Hari");
		tm.put(0, "Nimu");
		tm.put(15, "Gopi");
		tm.put(25, "Samer");
		tm.put(5, "Papu");
		tm.put(20, "Pabi");
		tm.put(30, "Siba");
		System.out.println(tm);
	}

}
