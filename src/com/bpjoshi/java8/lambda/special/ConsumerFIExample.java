package com.bpjoshi.java8.lambda.special;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class ConsumerFIExample {
	public static<Integer> void processAccept(List<Integer> list, Consumer<Integer> c){
		for(Integer i: list){
			c.accept(i);
		}
	}
	public static void main(String... args){
		processAccept(Arrays.asList(1, 2, 4, 5), (Integer i)->System.out.println(i));
	}
}
