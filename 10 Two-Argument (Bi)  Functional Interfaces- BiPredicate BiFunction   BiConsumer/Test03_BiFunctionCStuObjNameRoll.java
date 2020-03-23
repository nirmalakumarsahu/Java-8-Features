//Test03_BiFunctionCStuObjNameRoll.java

import java.util.function.BiFunction;
import java.util.ArrayList;

class Student {
	String name;
	int rollno ;
	Student(String name, int rollno) {
		this.name=name;
		this.rollno= rollno;
	}
}

class Test03_BiFunctionCStuObjNameRoll {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		BiFunction<String, Integer, Student> f = (name, rollno) -> new Student(name, rollno);
		al.add(f.apply("Nimu", 100));
		al.add(f.apply("Pabi", 101));
		al.add(f.apply("Papu", 102));
		for (Student s:al) {
			System.out.println("Student Name :"+s.name);
			System.out.println("Student Rollno :"+s.rollno);
			System.out.println();
		}
	}
}
