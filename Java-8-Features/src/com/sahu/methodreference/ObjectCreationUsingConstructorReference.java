package com.sahu.methodreference;

public class ObjectCreationUsingConstructorReference {

	public static void main(String[] args) {
		Interf interf = Sample::new;
		interf.get();
	}

}
