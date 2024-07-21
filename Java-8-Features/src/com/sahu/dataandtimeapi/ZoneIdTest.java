package com.sahu.dataandtimeapi;

import java.time.ZoneId;

public class ZoneIdTest {

	public static void main(String[] args) {
		ZoneId systemDefaultZone = ZoneId.systemDefault();
		System.out.println(systemDefaultZone);
	}

}
