package com.sahu.dataandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1989, 8, 28);
		Period period = Period.between(birthDay, today);
		System.out.printf("Age is %d years %d monthos %d days", period.getYears(), period.getMonths(),
				period.getDays());

		LocalDate deathDay = LocalDate.of(1989 + 60, 6, 15);
		Period deathPeriod = Period.between(today, deathDay);
		int daysOnEarth = deathPeriod.getYears() * 365 + deathPeriod.getMonths() * 30 + deathPeriod.getDays();
		System.out.printf("\nYou will be in the earth only %d days.. Hurry up to do more important things", daysOnEarth);
	}

}
