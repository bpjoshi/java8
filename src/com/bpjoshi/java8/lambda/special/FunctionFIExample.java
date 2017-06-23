package com.bpjoshi.java8.lambda.special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class FunctionFIExample {
	public static<String, Integer> List<Integer> applyMapping(List<String> list, 
			Function<String, Integer> f){
		List<Integer> results=new ArrayList<>();
		for(String s: list){
			results.add(f.apply(s));
		}
		return results;
	}
	
	public static void main(String... args){
		List<Integer> list=applyMapping(Arrays.asList("I", "love", "Jezyk", "polski"), (String s)->s.length());
		for(Integer i: list){
			System.out.println(i);
		}
	}
}
