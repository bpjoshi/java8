package com.bpjoshi.java8.lambda.person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest1 {
	public static void main(String[] args) {
		List<Person> personList=Arrays.asList(new Person("Pan", "Kowalski", 65),
				new Person("Michal", "Sokolowski", 65),new Person("Bhagwati", "Prasadski", 65),
				new Person("Deepak", "Joshisiski", 65));
	//sort by last name
		//Java 7 way
		Comparator<Person> compByLastName= new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName()) ;
			}
		};
		Collections.sort(personList, compByLastName);
		for(Person person: personList) System.out.println(person.getLastName());
		//Java 8 way
		personList.sort((Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		for(Person person: personList) System.out.println(person.getLastName());
	}
	
}
