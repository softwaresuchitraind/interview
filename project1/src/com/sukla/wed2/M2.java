package com.sukla.wed2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//reverse string
public class M2
{
	public static void main(String[] args)
	{
		String s = "suchitra";
		
		
		
		String s1=reverse(s);
		System.out.println(s1);
		
		/*
		String collect = IntStream
				.rangeClosed(1, s.length())
				.mapToObj(i->s.charAt(s.length()-i))
				.map(Object::toString)
				.collect(Collectors.joining());
		System.out.println(collect);*/
				
		
	}
	
	public static String reverse(String s)
	{
		if(s.isEmpty())
		{
			return "";
		}
		return reverse(s.substring(1))+s.charAt(0);
	}

	
}
