package com.bpjoshi.java8.lambda.special;

import java.io.BufferedReader;
import java.io.IOException;
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
	String process(BufferedReader br) throws IOException;
}
