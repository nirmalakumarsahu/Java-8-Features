//Test03_MRUsingRunnable.java

class Test03_MRUsingRunnable {

	public void m1() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		Test03_MRUsingRunnable t = new Test03_MRUsingRunnable();
		Runnable r = t::m1;
		Thread t1 = new Thread(r);
		t12.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
