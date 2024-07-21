package com.sahu.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierToGenerateRandomPassword {

	public static void main(String[] args) {
		Supplier<String> randomPasswordSupplier = () -> {
			StringBuffer password = new StringBuffer();
			Supplier<Integer> getNumber = () -> (int) (Math.random() * 10);

			String symboles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> getCharacter = () -> symboles.charAt((int) (Math.random() * 29));

			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					password.append(getNumber.get());
				} else {
					password.append(getCharacter.get());
				}
				
				//Using ternary operator
				//password.append((i % 2 == 0) ? getNumber.get() : getCharacter.get());
			}
			return password.toString();
		};
		System.out.println(randomPasswordSupplier.get());
		System.out.println(randomPasswordSupplier.get());
	}

}
