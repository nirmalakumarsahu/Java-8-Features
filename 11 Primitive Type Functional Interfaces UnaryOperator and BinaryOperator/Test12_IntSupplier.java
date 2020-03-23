//Test12_IntSupplier.java

import java.util.function.IntSupplier;

class Test12_IntSupplier {

	public static void main(String[] args) {
		IntSupplier s = () -> (int)(Math.random()*10);
		String otp="";
		for (int i=0; i<6; i++) {
			otp=otp+s.getAsInt();
		}
		System.out.println("your OTP is : "+otp);
	}
}
