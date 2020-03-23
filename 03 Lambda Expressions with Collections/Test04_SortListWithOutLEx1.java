//Test04_SortListWithOutLEx1.java
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1>i2) {
			return -1;
		} else if (i1<i2) {
			return +1;
		} else{
			return 0;
		}
	}
}


class Test04_SortListWithOutLEx1 {

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
