package com.bpjoshi.java8.streams;

import java.util.List;

public class StreamEx1 {
	public static void main(String[] args) {
		List<Movie> movies = MoviesList.giveMoviesList();
		movies.stream().forEach(System.out::println);
		//count of movies with rating 5
		long count=movies.stream().filter(m->m.getRating()==5)
				.distinct().limit(3).count();
		System.out.println("Count of movies with rating 5: "+count);
	}
}
