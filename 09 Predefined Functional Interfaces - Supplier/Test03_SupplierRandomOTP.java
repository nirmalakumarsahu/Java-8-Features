//Test03_SupplierRandomOTP.java

import java.util.function.Supplier;

class Test03_SupplierRandomOTP {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp="";
			for (int i=0; i<6; i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("Your OTP is : "+s.get());
	}
}
