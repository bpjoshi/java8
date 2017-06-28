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
		/*
		 * select movies which have ratins below 5 and sort them alphatically
		 */
		List<Movie> movies=MoviesList.giveMoviesList();
		List<String> below5Movies=movies.stream()
										.filter(m->m.getRating()<5)
										.sorted(comparing(Movie::getName))
										.map(Movie::getName)
										.collect(toList());
		for(String m:below5Movies){
			System.out.println(m);
		}
	}
}
