//Test05_SortListWithOutLEx2.java
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return (i1>i2)?-1:(i1<i2)?+1:0;
	}
}


class Test05_SortListWithOutLEx2  {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before Sorting : "+al);
		Collections.sort(al);
		System.out.println("After Default Sorting : "+al);
		Collections.sort(al, new MyComparator());
		System.out.println("After Sorting : "+al);
	}

}
