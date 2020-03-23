//Test01_CurrentDate$Time.java

import java.time.LocalDate;
import java.time.LocalTime;

class Test01_CurrentDate$Time {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
