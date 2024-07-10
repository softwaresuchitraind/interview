package com.sukla.friday;

import java.util.Arrays;
import java.util.List;

public class PersonMain
{
	public static void main(String[] args)
	{
		Person p1 = new Person("1","abc",25);
		Person p2 = new Person("4","mno",20);
		Person p3 = new Person("2","xyz",22);
		Person p4 = new Person("3","pqr",18);
		
		//System.out.println(p1.equals(p2));
		List<Person> personsList = Arrays.asList(p1,p2,p3,p4);
		
		personsList.stream().sorted((x,y)->x.getAge().compareTo(y.getAge())).forEach(System.out::println);
		
	}

}
