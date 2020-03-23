//Test06_InstV_CLV_AccLEx.java

@FunctionalInterface
interface Test06_Interface {
	public void m1();
}

class Test06_InstV_CLV_AccLEx  {
	
	int x=10;	//Class Level variable

	public void m2() {
		int y=20;	//Local variable
		int z=30;
		Test06_Interface i = () -> {
			x=888;
			y=999; //CE:
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}

	public static void main(String[] args) {
		Test06_InstV_CLV_AccLEx t  = new Test06_InstV_CLV_AccLEx();
		t.m2();
	}
	
}

/* the local variable of the method which are referenced from
local variable it final weather you are decalre or not

CE: local variables referenced from a lambda expression 
must be final or effectively final
*/