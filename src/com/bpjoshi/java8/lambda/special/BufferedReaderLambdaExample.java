package com.bpjoshi.java8.lambda.special;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class BufferedReaderLambdaExample {
	
	public static String processFile(BufferedReaderProcessor brp) throws IOException{
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
			return brp.process(br);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			String aLine=processFile((BufferedReader br)->br.readLine());
			String twoLine=processFile((BufferedReader br)->br.readLine()+br.readLine());
			System.out.println(twoLine);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}
