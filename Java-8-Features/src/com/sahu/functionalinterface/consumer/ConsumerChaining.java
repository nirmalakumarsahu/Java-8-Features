package com.sahu.functionalinterface.consumer;

import java.util.function.Consumer;

import com.sahu.model.Movie;

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> returnName = movie -> System.out.println("Movie "+movie.getName()+" is ready to release.");
		Consumer<Movie> returnResult = movie -> System.out.println("Movie "+movie.getName()+" is "+movie.getResult());
		Consumer<Movie> stroingInDB = movie -> System.out.println("Movie "+movie.getName()+" information storing in database.");
		Consumer<Movie> chainedCosnumer = returnName.andThen(returnResult).andThen(stroingInDB);
		Movie movie = new Movie("Bahubali", "Hit");
		chainedCosnumer.accept(movie);
	}
	
}
