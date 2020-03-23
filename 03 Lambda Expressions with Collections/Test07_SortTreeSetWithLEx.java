//Test07_SortTreeSetWithLEx.java

import java.util.TreeSet;

class Test07_SortTreeSetWithLEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>((i1,i2) -> (i1>i2)?-1:(i1<i2)?+1:0);
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(25);
		ts.add(5);
		ts.add(20);
		ts.add(30);
		System.out.println(ts);
	}

}
