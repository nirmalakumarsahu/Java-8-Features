//Test15_FI_WithOut_LE3.java

interface Test15_Interface {
	public int getLength(String str);
}

class Test15_Demo  implements Test15_Interface {
	public int getLength(String str) {
		return str.length();
	}
}

class Test15_FI_WithOut_LE3 {
	
	public static void main(String[] args) {
		Test15_Interface i = new Test15_Demo();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("Without lambda"));
	}

}