//Test17_FI_WithOut_LE4.java

interface Test17_Interface {
	public int squareIt(int x);
}

class Test17_Demo  implements Test17_Interface {
	public int squareIt(int x) {
		return x*x;
	}
}

class Test17_FI_WithOut_LE4 {
	
	public static void main(String[] args) {
		Test17_Interface i = new Test17_Demo();
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(5));
	}

}