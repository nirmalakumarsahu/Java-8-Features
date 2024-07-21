package com.sahu.primitivefunctionalinterfaces;

import java.util.function.IntSupplier;

public class RandomOTPUsingIntSupplier {

	public static void main(String[] args) {
		IntSupplier randomNum = () -> (int) (Math.random() * 10);
		StringBuffer otp = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			otp.append(randomNum.getAsInt());
		}
		System.out.println("OTP is - "+otp.toString());
	}
	
}
