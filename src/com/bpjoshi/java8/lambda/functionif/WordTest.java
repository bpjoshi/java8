package com.bpjoshi.java8.lambda.functionif;

import java.util.function.Function;

public class WordTest {
	public static void main(String[] args) {
		String txt="Hello World from India";
		System.out.println("Initial String: "+txt);
		Function<String, String> addHead=Word::addHeader;
		Function<String, String> pipeLine=addHead.andThen(Word::spellCheck).andThen(Word::addFooter);
	    String result=pipeLine.apply(txt);
	    System.out.println("\nResult String after pipeLine fn: \n"+result);
	}
}
