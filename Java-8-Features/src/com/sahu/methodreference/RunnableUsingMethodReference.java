package com.sahu.methodreference;

public class RunnableUsingMethodReference {

	public static void main(String[] args) {
		RunnableUsingMethodReference methodReference = new RunnableUsingMethodReference();
		Runnable runnable = methodReference::m1;
		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

}
