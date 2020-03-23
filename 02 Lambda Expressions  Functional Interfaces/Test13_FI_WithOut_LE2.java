//Test13_FI_WithOut_LE2.java

interface Test13_Interface {
	public void add(int a, int b);
}

class Test13_Demo implements Test13_Interface {
	public void add(int a, int b) {
		System.out.println("The sum is : "+(a+b));
	}
}

class Test13_FI_WithOut_LE2 {
	
	public static void main(String[] args) {
		Test13_Interface i = new Test13_Demo();
		i.add(10,20);
		i.add(100,200);
	}

}