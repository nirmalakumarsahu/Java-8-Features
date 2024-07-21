package com.sahu.functionalinterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierToGetSystemDate {

	public static void main(String[] args) {
		Supplier<Date> systemDateSupplier = () -> new Date();
		System.out.println(systemDateSupplier.get());
	}
	
}
