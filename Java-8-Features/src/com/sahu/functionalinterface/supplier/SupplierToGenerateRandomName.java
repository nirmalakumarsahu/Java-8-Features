package com.sahu.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierToGenerateRandomName {

	public static void main(String[] args) {
		Supplier<String> randomNameSupplier = () -> {
			String[] names = { "Sunny", "Bunny", "Chinny", "Vinny" };
			int randomNum = (int) (Math.random() * 4);
			return names[randomNum];
		};
		System.out.println(randomNameSupplier.get());
		System.out.println(randomNameSupplier.get());
		System.out.println(randomNameSupplier.get());
	}

}
