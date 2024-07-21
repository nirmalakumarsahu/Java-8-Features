package com.sahu.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sahu.model.Student2;

public class ConsumePredicateFunctionToPrintStudentDetails {

	public static void main(String[] args) {
		List<Student2> students = new ArrayList<>();
		populateStudent(students);

		Predicate<Student2> getStudent = stud -> stud.getMarks() >= 60;
		Function<Student2, String> getGrade = stud -> {
			int marks = stud.getMarks();
			if (marks >= 80) {
				return "A";
			} else if (marks >= 60) {
				return "B";
			} else if (marks >= 50) {
				return "C";
			} else if (marks >= 35) {
				return "D";
			} else {
				return "E";
			}
		};
		Consumer<Student2> printStudent = stud -> {
			System.out.println("Name: "+stud.getName());
			System.out.println("Mark: "+stud.getMarks());
			System.out.println("Grade: "+getGrade.apply(stud));
			System.out.println();
		};
		
		for (Student2 student : students) {
			if (getStudent.test(student)) {
				printStudent.accept(student);
			}
		}

	}

	private static void populateStudent(List<Student2> students) {
		students.add(new Student2("Sunny", 100));
		students.add(new Student2("Bunny", 65));
		students.add(new Student2("Chinny", 55));
		students.add(new Student2("Vinny", 45));
		students.add(new Student2("Pinny", 25));
	}

}
