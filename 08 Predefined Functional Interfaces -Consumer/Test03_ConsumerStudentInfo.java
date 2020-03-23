//Test03_ConsumerStudentInfo

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class Student {
	String name;
	int mark;
	Student(String name, int mark) {
		this.name=name;
		this.mark=mark;
	}
}

class Test03_ConsumerStudentInfo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		populate(al);
		Predicate<Student> p = s -> s.mark>=60;
		Function<Student, String> f = s -> {
			int mark=s.mark;
			if (mark>=80) {
				return "A";
			} else if(mark>=60) {
				return "B";
			} else if(mark>=50) {
				return "C";
			} else if(mark>=35) {
				return "D";
			} else {
				return "E";
			}
		};
		Consumer<Student> c = s -> {
			System.out.println("Name : "+s.name);
			System.out.println("Mark : "+s.mark);
			System.out.println("Grade : "+f.apply(s));
			System.out.println();
		};
		for (Student s:al) {
		//	if (p.test(s))
				c.accept(s);
		} 
	}

	public static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 100));
		al.add(new Student("Bunny", 65));
		al.add(new Student("Chinny", 55));
		al.add(new Student("Vinny", 45));
		al.add(new Student("Pinny", 25));
	}

}
