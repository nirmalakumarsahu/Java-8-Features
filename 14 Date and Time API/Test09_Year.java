//Test09_Year.java

import java.util.Scanner;
import java.time.Year;

class Test09_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your year : ");
		int year = sc.nextInt();
		Year y = Year.of(year);
		if (y.isLeap()) {
			System.out.println(year+" year is a leap year");
		} else {
			System.out.println(year+" year is not a leap year");
		} 
	}
}
