//Test02_SupplierRandomNumber.java

import java.util.function.Supplier;

class Test02_SupplierRandomNumber {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] s1 = {"Sunny", "Bunny", "Chinnuy"};
			int x = (int)(Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
