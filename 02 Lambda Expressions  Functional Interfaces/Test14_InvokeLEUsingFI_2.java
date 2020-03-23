//Test14_InvokeLEUsingFI_2

interface Test14_Interface {
	public void add(int a, int b);
}

class Test14_InvokeLEUsingFI_2 {

	public static void main(String[] args) {

		Test14_Interface i = (a, b) -> System.out.println("The sum is : "+(a+b));
		i.add(10,20);
		i.add(100,200);
	
	}

} 
