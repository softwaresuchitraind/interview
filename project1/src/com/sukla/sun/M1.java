package com.sukla.sun;

import java.util.Optional;
import java.util.stream.IntStream;

public class M1
{
	public static void main(String[] args)
	{
		String s = "dfvAAAAAAddf" ;

		String s2 ="AAA";

		/*
		Optional<Integer> optional=IntStream.rangeClosed(1,s2.length())
			  .mapToObj(i->s2.charAt(s2.length()-i))
			  .anyMatch(e->e.rangeClosed(1,s.length()).mapToObject(i->s.charAt(s.length1-i))).get();
	}*/
		
		boolean contains = s.contains(s2);
		System.out.println(contains);
	}

}
