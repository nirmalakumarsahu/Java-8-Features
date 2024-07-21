package com.sahu.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierToGenerateRandomOTP {

	public static void main(String[] args) {
		Supplier<String> randomOTPSupplier = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(randomOTPSupplier.get());
		System.out.println(randomOTPSupplier.get());
	}

}
