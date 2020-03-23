//Test08_DeathDay.java

import java.time.LocalDate;
import java.time.Period;

class Test08_DeathDay {
	
	public static void main(String[] args) {
		LocalDate deathday = LocalDate.of(1998+60,11,10);
		LocalDate today = LocalDate.now();
		Period p = Period.between(today, deathday);
		int d = p.getYears()*365+p.getMonths()*30+p.getDays();
		System.out.printf("You will be on the earth %d days..Hutty up to do more important things\n", d);
	}

}
