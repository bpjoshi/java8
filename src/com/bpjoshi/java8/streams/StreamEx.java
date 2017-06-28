package com.bpjoshi.java8.streams;

import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class StreamEx {
	public static void main(String[] args) {
		
		List<Movie> movies = MoviesList.giveMoviesList();
		//Movies below rating 5
		System.out.println("Movies which have a rating less than 5 sorted by name:\n");
		below5Movies(movies);
		System.out.println("\nMovies of Fantasy Genre sorted by rating:\n");
		fantasyMovies(movies);
		System.out.println("\nAdult Movies:\n");
		adultMovies(movies);
	}
	/*
	 * select movies which have ratins below 5 and sort them alphatically
	 */
	public static void below5Movies(List<Movie> movies) {
		List<String> below5Movies = movies.parallelStream()
				.filter(m -> m.getRating() < 5)
				.sorted(comparing(Movie::getName)).map(Movie::getName)
				.collect(toList());
		//use movies.parallelStream() to process the collection in parallelization
		// print it.
		System.out.println(below5Movies);
	}
	/*
	 * select movies which are fantasy genre and sort by rating
	 */
	public static void fantasyMovies(List<Movie> movies){
		List<String> fantasyMovies = movies.stream()
				.filter(m -> m.getType().equals(Movie.Type.FANTASY))
				.sorted(comparing(Movie::getRating).reversed())
				.map(Movie::getName).collect(toList());
		// print it.
		System.out.println(fantasyMovies);
	}
	
	/*
	 * Adult Movies; 
	 * not for children ;) 
	 */
	public static void adultMovies(List<Movie> movies){
		List<String> adultMovies = movies.stream()
				.filter(m -> m.isAdult()==true)
				.map(Movie::getName).collect(toList());
		// print it.
		System.out.println(adultMovies);
	} 
}
