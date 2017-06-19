package com.bpjoshi.java8.lambda;
/**
@author Bhagwati Prasad(bpjoshi)
*/
public class LIntro{

  public static void main(String[] args) {
    LIntroIF lambdaGreet=()->System.out.println("Hi");
    lambdaGreet.perform();
  }

}
