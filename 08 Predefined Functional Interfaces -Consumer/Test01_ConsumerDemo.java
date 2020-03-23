//Test01_ConsumerDemo.java

import java.util.function.Consumer;
 
class Test01_ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c = s-> System.out.println(s);
		c.accept("nimu");
		c.accept("Nirmal sahu");
	}
}
