//Test07_BirthDay.java

import java.time.LocalDate;
import java.time.Period;

class Test07_BirthDay {
	
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1998,11,10);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d years %d months %d days\n", p.getYears(),p.getMonths(),p.getDays());
	}
}
