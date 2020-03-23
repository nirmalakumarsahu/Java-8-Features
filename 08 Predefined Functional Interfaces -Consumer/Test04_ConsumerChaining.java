//Test04_ConsumerChaining.java

import java.util.function.Consumer;

class Movie {
	String name;
	String result;
	Movie(String name, String result) {
		this.name=name;
		this.result=result;
	}
}

class Test04_ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println("Movie : "+m.name+" is ready to relase");
		Consumer<Movie> c2 = m -> System.out.println("Movie : "+m.name+" is "+m.result);
		Consumer<Movie> c3 = m -> System.out.println("Movie : "+m.name+" information in DB");
		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
		Movie m = new  Movie("Bahubali", "hit");
		chainedC.accept(m);
	}

}
