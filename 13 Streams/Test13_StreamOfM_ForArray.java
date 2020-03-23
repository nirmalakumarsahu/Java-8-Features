//Test13_StreamOfM_ForArray.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Test13_StreamOfM_ForArray {

	public static void main(String[] args) {
		Double[] d = {10.0, 10.1,  10.1, 10.3, 10.4};
		Stream<Double> s = Stream.of(d);
		s.forEach(System.out::println);
	}

}
