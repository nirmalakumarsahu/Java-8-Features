//Test21_WhyFIConOnlyOAM.java

interface Test20_Interface1 {
	public void m1();
}

interface Test20_Interface2 {
	public void m1();
	public void m2();
}

class Test21_WhyFIConOnlyOAM {

	public static void main(String[] args) {
		
		Test20_Interface1 i1 = () -> System.out.println("Functional interface contains only one abstract method");
		i1.m1();
		System.out.println();

		//Test20_Interface2 i2 = () -> System.out.println("Second interface contains two abstract method ");
		System.out.println();
	}

}

/* CE:
incompatible types: Test20_Interface2 is not a functional interface
                Test20_Interface2 i2 = () -> System.out.println("Second interface contains two abstract method ");
                                       ^
    multiple non-overriding abstract methods found in interface Test20_Interface2
*/