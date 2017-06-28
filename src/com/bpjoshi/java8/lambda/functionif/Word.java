package com.bpjoshi.java8.lambda.functionif;

public class Word {
	public static String addHeader(String txt){
		return "From Bhagwati Prasad with love :\n\n"+txt;
	}
	public static String addFooter(String txt){
		return txt+"\n Kind Regards";
	}
	public static String spellCheck(String txt){
		return txt.replaceAll("India", "Poland");
	}
}
