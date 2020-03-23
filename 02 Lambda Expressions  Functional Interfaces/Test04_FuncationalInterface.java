//Test04_FuncationalInterface.java

interface Test04_FuncationalInterface {

	public void m1();

	default void m2() {
		System.out.println("Default method");
	}

	public static void m3() {
		System.out.println("Static method");
	}

}

/* funtional interface because it contain one abstract
method the rule is the interface must contain only one
abstract method and it least bothers that contain n number
of default and static method but not contain two abstract
method.
*/