package com.bpjoshi.java8.lambda.functionif;

import java.util.function.Function;

/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class FunctionIFExample {
	public static void main(String[] args) {
		Function<Integer, Integer> f=x->x+1;
		Function<Integer, Integer> g=x->x*2;
		//example of default method andThen
		Function<Integer, Integer> h=f.andThen(g);
		int result=h.apply(1);
		System.out.println("Result of f.andThen(g): "+result);
		//example of default method compose
		h=f.compose(g);
		result=h.apply(1);
		System.out.println("Result of f.compose(g): "+result);
	}

}
