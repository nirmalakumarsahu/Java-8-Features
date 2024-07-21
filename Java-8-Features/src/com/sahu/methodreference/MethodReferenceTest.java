package com.sahu.methodreference;

public class MethodReferenceTest {

	public static void main(String[] args) {
		// using lambda expression
		Interf2 interf1 = () -> System.out.println("Implmentation By Lambda expression");
		interf1.m1();

		Interf2 interf2 = MethodReferenceTest::m2;
		interf2.m1();
	}

	public static void m2() {
		System.out.println("Implementation By method Reference");
		// other codes
	}
	
}
