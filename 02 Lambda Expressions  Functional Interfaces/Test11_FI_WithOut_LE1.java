//Test11_FI_WithOut_LE1.java

interface Test11_Interface {
	public void m1();
}

class Test11_Demo  implements Test11_Interface {
	public void m1() {
		System.out.println("Normal implementation");
	}
}

class Test11_FI_WithOut_LE1 {
	
	public static void main(String[] args) {
		Test11_Interface i = new Test11_Demo();
		i.m1();
	}

}