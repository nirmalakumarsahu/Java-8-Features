//Test05_StaticMethod.java

interface Test05_Interface {
	public static void m1() {
		System.out.println("interface static method");
	}
}

class Test05_StaticMethod implements Test05_Interface {
	
	public static void main(String[] args) {
		
		 //m1();
		Test05_StaticMethod t = new Test05_StaticMethod();
		//t.m1();
		//Test05_StaticMethod.m1();
		Test05_Interface.m1();
	
	}

}
