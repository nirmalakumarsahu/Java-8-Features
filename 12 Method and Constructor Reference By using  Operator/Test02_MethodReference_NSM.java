//Test02_MethodReference_NSM.java

interface Test02_Interface {
	public void m1();
}

class Test02_MethodReference_NSM {

	public void m2() {
		System.out.println("Method Reference");
	}

	public static void main(String[] args) {
		Test02_MethodReference_NSM t = new Test02_MethodReference_NSM();
		Test02_Interface i = t::m2;
		i.m1();
	} 

}