package com.bpjoshi.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MoviesList {
	public static List<Movie> giveMoviesList(){
		List<Movie> movies=Arrays.asList(
				new Movie("Harry Potter", false, 5, "EN", Movie.Type.FANTASY),
				new Movie("LOTR", false, 5, "EN", Movie.Type.FANTASY),
				new Movie("Katyn", false, 4, "PL", Movie.Type.WAR),
				new Movie("Bahubali", false, 5, "HI", Movie.Type.FANTASY),
				new Movie("Titanic", false, 5, "EN", Movie.Type.ROMANCE),
				new Movie("Sholay", false, 4, "EN", Movie.Type.COMEDY),
				new Movie("Ciao", false, 3, "PL", Movie.Type.COMEDY),
				new Movie("K3G", false, 4, "HI", Movie.Type.ROMANCE),
				new Movie("American Pie", true, 4, "EN", Movie.Type.COMEDY),
				new Movie("RoopaKaROOP", true, 3, "EN", Movie.Type.ROMANCE)
				);
		return movies;
	}
}
