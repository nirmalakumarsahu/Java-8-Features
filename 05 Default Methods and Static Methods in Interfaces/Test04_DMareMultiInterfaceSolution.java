//Test04_DMareMultiInterfaceSolution.java

interface Test04_Left {
	default void m1() {
		System.out.println("Left Default Method");
	}
}

interface Test04_Right {
	default void m1() {
		System.out.println("Right Default Method");
	}
}

class Test04_DMareMultiInterfaceSolution implements Test04_Left, Test04_Right {
	
	@Override
	public void m1() {
		//System.out.println("My own implementation");
		Test04_Left.super.m1();
		//Test04_Right.super.m1();
	}

	public static void main(String[] args) { 
		Test04_DMareMultiInterfaceSolution t = new Test04_DMareMultiInterfaceSolution();
		t.m1();
	}

}
 