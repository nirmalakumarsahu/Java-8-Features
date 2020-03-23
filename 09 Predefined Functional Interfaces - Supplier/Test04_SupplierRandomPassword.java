//Test04_SupplierRandomPassword.java

import java.util.function.Supplier;

class Test04_SupplierRandomPassword {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String pwd = "";
			Supplier<Integer> d = () -> (int)(Math.random()*10);
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
			for (int i=1; i<=8; i++) {
				if (i%2==0){
					pwd=pwd+d.get();
				} else {
					pwd=pwd+c.get();
				}
			}
			return pwd;
		};
		System.out.println("Your password is : "+s.get());
	}

}

/*Rule:
-------
1. length should be 8 character
2. 2,4,6,8 places only digits
3. 1,3,5,7 places only uppercase alphabet symbols
@,#,$
*/
