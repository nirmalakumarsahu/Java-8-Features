//Test02_ConsumerMovieInfo.java

import java.util.function.Consumer;
import java.util.ArrayList;

class Movie {
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name=name;
		this.hero=hero;
		this.heroine=heroine;
	}
}
class Test02_ConsumerMovieInfo {

	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<>();
		populate(al);
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name : "+m.name);
			System.out.println("Movie Hero : "+m.hero);
			System.out.println("Movie Heroine : "+m.heroine);		
			System.out.println();		
		};
		for (Movie m:al) {
			c.accept(m);
		}
	}

	public static void populate(ArrayList<Movie> al) {
		al.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		al.add(new Movie("Rayees", "Sharukh", "Sunny"));
		al.add(new Movie("Dangal", "Ameer", "Ritu"));
		al.add(new Movie("Sultan", "Salman", "Anushka"));
	}

}
