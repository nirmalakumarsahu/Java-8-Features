//Test01_DefaultMNotOverride.java

interface Test01_Interface {
	default void m1() {
		System.out.println("Default Method");
	}
}

class Test01_DefaultMNotOverride implements Test01_Interface {

	public static void main(String[] args) {
		Test01_DefaultMNotOverride t = new Test01_DefaultMNotOverride();
		t.m1();
	}

}


//Execute form interface super class