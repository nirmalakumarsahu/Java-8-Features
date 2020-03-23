//Test12_StreamOfM_ForGE.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Test12_StreamOfM_ForGE {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
	}

}
