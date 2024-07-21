package com.sahu.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.sahu.model.Movie2;

public class ConsumerToPrintMovieDetails {

	public static void main(String[] args) {
		List<Movie2> movies = new ArrayList<>();
		populateMovies(movies);
		
		Consumer<Movie2> printDetails = movie -> {
			System.out.println("Movie Name: "+movie.getName());
			System.out.println("Movie Hero: "+movie.getHero());
			System.out.println("Movie Heroine: "+movie.getHeroine());
			System.out.println();
		};
		
		for (Movie2 movie : movies) {
			printDetails.accept(movie);
		}
	}

	private static void populateMovies(List<Movie2> movies) {
		movies.add(new Movie2("Bahubali", "Prabhas", "Anuskha"));
		movies.add(new Movie2("Rayees", "Sharukh", "Sunny"));
		movies.add(new Movie2("Dangal", "Ameer", "Ritu"));
		movies.add(new Movie2("Sultan", "Salman", "Anushka"));
	}
	
}
