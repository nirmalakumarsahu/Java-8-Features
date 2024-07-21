package com.sahu.functionalinterface.predicate;

import java.util.function.Predicate;

import com.sahu.model.SoftwareEngineer;

public class PredicateToCheckAllowToPubOrNot {

	public static void main(String[] args) {
		SoftwareEngineer[] softwareEngineers = { new SoftwareEngineer("Durga", 60, false),
				new SoftwareEngineer("Sunil", 25, true), new SoftwareEngineer("Sayan", 26, true),
				new SoftwareEngineer("Subbu", 28, false), new SoftwareEngineer("Ravi", 19, true) };

		Predicate<SoftwareEngineer> allowed = softwareEngineer -> softwareEngineer.getAge() >= 18
				&& softwareEngineer.getIsHavingGF();
		 
		for (SoftwareEngineer softwareEngineer : softwareEngineers) {
			if (allowed.test(softwareEngineer)) {
				System.out.println(softwareEngineer);
			}
		}
	}

}
