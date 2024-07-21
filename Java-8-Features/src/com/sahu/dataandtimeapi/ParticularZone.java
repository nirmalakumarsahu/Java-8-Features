package com.sahu.dataandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ParticularZone {

	public static void main(String[] args) {
		ZoneId americaLAZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime americaLAZoneDateTime = ZonedDateTime.now(americaLAZone);
		System.out.println(americaLAZoneDateTime);
	}

}
