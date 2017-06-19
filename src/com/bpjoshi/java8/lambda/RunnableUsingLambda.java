package com.bpjoshi.java8.lambda;
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class RunnableUsingLambda {
	public static void main(String... args){
		//Using lambdas
		Runnable r=()->System.out.println("My thread 1 is running");
		Thread t1=new Thread(r);
		Thread t2=new Thread(()->System.out.println("My thread 2 is running"));
		t1.run();
		t2.run();
		//olderways
		Thread t3=new Thread(new Runnable(){
			public void run(){
				System.out.println("It's old way now ;) ");
			}
		});
		t3.run();
	}
}
