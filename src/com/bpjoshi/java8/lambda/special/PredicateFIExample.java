package com.bpjoshi.java8.lambda.special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class PredicateFIExample {
	/*
	 * 
	 */
	public static void main(String[] args) {
		Predicate<String> nonEmptyStrings=(String s)->!s.isEmpty();
		List<String> nonEmpty=filter(Arrays.asList("abc", "a", "", "hi"), nonEmptyStrings);
		for(String s: nonEmpty){
			System.out.println(s);
		}
	}
	/*Predicate adds non empty Strings to results and returns
	 * 
	 */
	public static List<String> filter(List<String> list, Predicate p){
		List<String> results=new ArrayList<>();
		for(String s: list){
			if(p.test(s)){
				results.add(s);
			}
		}
		return results;
	}

}
