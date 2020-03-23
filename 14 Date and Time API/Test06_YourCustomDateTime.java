//Test06_YourCustomDateTime.java

import java.time.LocalDateTime;

class Test06_YourCustomDateTime {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1995,05,28,12,45);
		System.out.println(dt);
		System.out.println("Afte six months : "+ dt.plusMonths(6));
		System.out.println("Befte six months: "+ dt.minusMonths(6));
	}
}
