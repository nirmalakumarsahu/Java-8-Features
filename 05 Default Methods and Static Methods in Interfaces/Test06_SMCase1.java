//Test06_SMCase1.java

interface Test06_Interface {
	public static void m1() {
		System.out.println("interface static method");
	}
}

class Test06_SMCase1 implements Test06_Interface {
	
	public static void m1() {
		System.out.println("Own implementaion method");
	}

	public static void main(String[] args) {
	
	}

}

/* #case 1:
--------------
here the method is not override int the sub class
Overriding concept is not applicable for static 
method of interface.

here both method present in the interface or in the 
class both are static these are valid but not overriding.
*/