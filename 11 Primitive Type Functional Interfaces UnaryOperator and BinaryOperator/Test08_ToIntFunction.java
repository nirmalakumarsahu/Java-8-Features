//Test08_ToIntFunction.java

import java.util.function.ToIntFunction;

class Test08_ToIntFunction {

	public static void main(String[] args) {  
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("nimu"));
	}
}
