//Test12_InvokeLEUsingFI_1.java

interface Test12_Interface {
	public void m1();
}

class Test12_InvokeLEUsingFI_1 {
	
	public static void main(String[] args) {
		Test12_Interface i = () -> System.out.println("Lambda expression implementation");
		i.m1();
	}

}