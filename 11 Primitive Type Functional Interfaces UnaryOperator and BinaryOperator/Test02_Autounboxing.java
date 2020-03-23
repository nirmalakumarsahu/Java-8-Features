//Test02_Autounboxing.java

class Test02_Autounboxing {

	public static void main(String[] args) {
		Integer i1 = 10;
		int i2=i1;
		System.out.println(i2);
		int i3=i1.intValue();
		System.out.println(i3);
	}
}
