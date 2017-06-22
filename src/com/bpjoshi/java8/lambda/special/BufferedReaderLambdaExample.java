package com.bpjoshi.java8.lambda.special;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderLambdaExample {
	public static void main(String[] args) {
		String oneLine=processFile((BufferedReader br)->br.readLine());
	}
	
	public static String processFile(BufferedReaderProcessor p){
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
			try {
				return p.process(br);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	
}
