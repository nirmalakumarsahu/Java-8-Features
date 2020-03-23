//Test03_DMareMultiInterface.java

interface Test03_Left {
	default void m1() {
		System.out.println("Left Default Method");
	}
}

interface Test03_Right {
	default void m1() {
		System.out.println("Right Default Method");
	}
}

class Test03_DMareMultiInterface implements Test03_Left, Test03_Right {

	public static void main(String[] args) { 
		System.out.println("Hello World!");
	}
}
