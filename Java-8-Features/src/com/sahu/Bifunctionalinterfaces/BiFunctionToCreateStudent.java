package com.sahu.Bifunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import com.sahu.model.Student;

public class BiFunctionToCreateStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		BiFunction<String, Integer, Student> createStudent = (name, rollNo) -> new Student(name, rollNo);
		students.add(createStudent.apply("Durga", 100));
		students.add(createStudent.apply("Ravi", 200));
		students.add(createStudent.apply("Shiva", 300));

		for (Student student : students) {
			System.out.println("Name: " + student.getName());
			System.out.println("RollNo: " + student.getRollNo());
		}
	}

}