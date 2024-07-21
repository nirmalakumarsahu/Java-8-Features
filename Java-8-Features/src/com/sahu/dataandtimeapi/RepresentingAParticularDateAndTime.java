package com.sahu.dataandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class RepresentingAParticularDateAndTime {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(1995,Month.APRIL,28,12,45);
		System.out.println(dateTime);
		
		System.out.println("After six months - "+dateTime.plusMonths(6));
		System.out.println("Before six months - "+dateTime.minusMonths(6));
	}
	
} 