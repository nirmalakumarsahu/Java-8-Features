//Test02_DefaultMOverride.java

interface Test02_Interface {
	default void m1() {
		System.out.println("Default Method");
	}
}

class Test02_DefaultMOverride implements Test02_Interface {
	
	public void m1() {
		System.out.println("My own implementation");
	}

	public static void main(String[] args) {
		Test02_DefaultMOverride t = new Test02_DefaultMOverride();
		t.m1();
	}

}


//Execute form sub class