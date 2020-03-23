//Test10_IntConsumer.java

import java.util.function.IntConsumer;

class Test10_IntConsumer {

	public static void main(String[] args) {
		IntConsumer c = i -> System.out.println("The square of i  : "+(i*i));
		c.accept(10);
	}

}
