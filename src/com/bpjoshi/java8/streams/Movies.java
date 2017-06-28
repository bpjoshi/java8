package com.bpjoshi.java8.streams;
/**
 * 
 * @author Bhagwati Prasad
 * Immutable class Movies
 */
public class Movies {
	private final String name;
	private final boolean adult;
	private final int rating;
	private final String language;
	private final Type type;
	
	public Movies(String name, boolean adult, int rating, String language, Type type){
		this.name=name;this.adult=adult; this.rating=rating; this.language=language;this.type=type;
	}

	public String getName() {
		return name;
	}

	public boolean isAdult() {
		return adult;
	}

	public int getRating() {
		return rating;
	}

	public String getLanguage() {
		return language;
	}
	
	public String toString(){
		return name;
	}
	
	public enum Type{HORROR, ROMANCE, FANTASY}
}
