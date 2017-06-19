package com.bpjoshi.java8.lambda;

import java.util.function.IntPredicate;
/*
@author Bhagwati Prasad(bpjoshi)
*/
class IntPredicateExample {
  public static void main(String[] args) {
    IntPredicate evenNumbers=(int i)->i%2==0;
    System.out.println("Is 10 an even number? "+evenNumbers.test(10));

    IntPredicate oddNumbers=(int i)->i%2==1;
    System.out.println("Is 12 an odd number? "+oddNumbers.test(12));
  }

}
