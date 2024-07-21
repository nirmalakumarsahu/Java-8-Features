package com.sahu.functionalinterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sahu.model.Student2;

public class FunctionToFindGrade {

	public static void main(String[] args) {
		List<Student2> students = new ArrayList<>();
		populateStudent(students);

		Function<Student2, String> togetGradeFunction = student -> {
			int marks = student.getMarks();
			if (marks >= 80) {
				return "A [Distinction]";
			} else if (marks >= 60) {
				return "B [First class]";
			} else if (marks >= 50) {
				return "C [Second class]";
			} else if (marks >= 35) {
				return "D [Third class]";
			} else {
				return "E [Fail]";
			}
		};

		Predicate<Student2> markPredicate = student -> student.getMarks() >= 60;

		for (Student2 stud : students) {
			if (markPredicate.test(stud)) {
				System.out.println("Student Name: " + stud.getName());
				System.out.println("Student Marks: " + stud.getMarks());
				System.out.println("Student Grade: " + togetGradeFunction.apply(stud));
				System.out.println();
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
