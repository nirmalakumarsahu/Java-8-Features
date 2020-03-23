//Test01_SupplierSystemDate.java

import java.util.function.Supplier;
import java.util.Date;

class Test01_SupplierSystemDate {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}
}
