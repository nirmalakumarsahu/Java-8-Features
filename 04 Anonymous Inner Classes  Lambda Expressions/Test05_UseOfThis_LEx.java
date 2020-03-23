interface Test05_Interface {
	public void m1();
}

class Test05_UseOfThis_LEx {
	
	int x=888;
	public void m2(){
		Test05_Interface i = () -> {
			int x=999;
			System.out.println(this.x);
		};
		i.m1();
	}

	public static void main(String[] args) {
		Test05_UseOfThis_LEx t = new Test05_UseOfThis_LEx();
		t.m2();
	}
}
