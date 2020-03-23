//Test07_SMCase2.java

interface Test0_Interface {
	public static void m1() {
		System.out.println("interface static method");
	}
}

class Test07_SMCase2 implements Test07_Interface {
	
	public void m1() {
		System.out.println("Own implementaion method");
	}

	public static void main(String[] args) {
	
	}

}

/* #case 2:
--------------
here method present in the interface is static or in the 
class is non-static these are valid but not overriding.
*/