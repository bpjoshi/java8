package com.bpjoshi.java8.lambda;

public class StringLengthExample {
	public static void main(String... args){
		//LengthCalculator lCLambda=(String s)->s.length();
		//If you have only one input you dont even need to mention it's type
		LengthCalculator lCLambda=(s)->s.length();
		System.out.println(lCLambda.getLenth("Github is cool"));
	}
}

interface LengthCalculator{
	int getLenth(String s);
}