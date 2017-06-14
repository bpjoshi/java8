package com.bpjoshi.java8.behaviourparameterization;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class FilterHumanUsingSortMethodOfList {
	public static void main(String[] args) {
		List<Human> humanList= new ArrayList<>();
		humanList.add(new Human("Pier", 75, "France"));
		humanList.add(new Human("Sumeet", 25, "India"));
		humanList.add(new Human("David", 35, "United Kingdom"));
		//in Java 8, List comes with a sort methods, We will solve using List's sort method first
		//Printing the Humans in humanList in alphabetical order of their names
		System.out.println("Print the Humans in Alphabetical orde of names.");
		humanList.sort(new Comparator<Human>() {
			public int compare(Human h1, Human h2){
				return h1.getName().compareTo(h2.getName());
			}
		});
		for(Human h: humanList){
			System.out.println(h.getName());
		}
		//Printing the Humans in humanList in increasing order of their age
		System.out.println("\nPrint the Humans in increasing order of their age.");
		humanList.sort(new Comparator<Human>() {
			public int compare(Human h1, Human h2){
				return h1.getAge().compareTo(h2.getAge());
			}
		});
		
		for(Human h: humanList){
			System.out.println(h.getName());
		}
		//Printing using Java 8 code using lambda expression for the same will be as below
		System.out.println("\nPrint the Humans in alphabetical order of their names using lambda");
		humanList.sort((Human h1, Human h2)->h1.getName().compareTo(h2.getName()));
		for(Human h: humanList){
				System.out.println(h.getName());
		}
	}
}

class Human{
	private String name;
	private Integer age;
	private String country;
	public String getName() {
		return name;
	}
	public Human(){
		
	}
	public Human(String name, Integer age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}