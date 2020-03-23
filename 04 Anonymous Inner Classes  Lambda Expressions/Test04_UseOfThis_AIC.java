interface Test04_Interface {
	public void m1();
}

class Test04_UseOfThis_AIC {
	
	int x=888;
	public void m2(){
		Test04_Interface i = new Test04_Interface() {
			int x=999;
			public void m1(){
				System.out.println(this.x);
			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		Test04_UseOfThis_AIC t = new Test04_UseOfThis_AIC();
		t.m2();
	}
}
