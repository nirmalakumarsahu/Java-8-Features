//Test01_MethodReference_SM.java

interface Test01_Interface {
	public void m1();
}

class Test01_MethodReference_SM {

	public static void m2() {
		System.out.println("Method Reference");
	}
	public static void main(String[] args) {
		Test01_Interface i = Test01_MethodReference_SM::m2;
		i.m1();
	} 

}
