//Test08_SMCase3.java

interface Test08_Interface {
	public static void m1() {
		System.out.println("interface static method");
	}
}

class Test08_SMCase3 implements Test08_Interface {
	
	private static void m1() {
		System.out.println("Own implementaion method");
	}

	public static void main(String[] args) {
	
	}

}

/* #case 3:
--------------
here method present in the interface is public and in the 
class is private but these are valid but not overriding.
*/