//Test18_InvokeLEUsingFI_4.java

interface Test18_Interface {
	public int squareIt(int x);
}

class Test18_InvokeLEUsingFI_4 {

	public static void main(String[] args) {
		Test18_Interface i = x -> x*x;
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(5));
	}

} 
