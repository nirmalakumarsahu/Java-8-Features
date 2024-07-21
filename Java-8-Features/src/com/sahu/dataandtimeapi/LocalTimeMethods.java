package com.sahu.dataandtimeapi;

import java.time.LocalTime;

public class LocalTimeMethods {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		System.out.printf("%d:%d:%d:%d", hour, minute, second, nano);
	}

}
