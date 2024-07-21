package com.sahu.methodreference;

public class ObjectCreationUsingLambdaExpression {

	public static void main(String[] args) {
		Interf interf = () -> {
			Sample sample = new Sample();
			return sample;
		};
		interf.get();
	}
	
}
