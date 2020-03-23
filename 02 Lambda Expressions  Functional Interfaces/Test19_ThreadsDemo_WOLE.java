//Test19_ThreadsDemo_WOLE.java

class MyRunnable implements Runnable {
	public void run() {
		for (int i=0; i<10; ++i) {
			System.out.println("Child Thread");
		}
	}
}

class Test19_ThreadsDemo_WOLE{

	public static void main(String[] args) {

		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i=0; i<10; ++i) {
			System.out.println("Main Thread");
		}
	}
}
