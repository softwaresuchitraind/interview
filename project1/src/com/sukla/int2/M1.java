package com.sukla.int2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class M1
{
	public static void main(String[] args)
	{
		String s ="hello";
		String s2= reverse(s);
		System.out.println(s2);
	}

	private static String reverse(String s)
	{
		/*
		if(s.isEmpty())
		{
			return "";
		}*/
		
		return IntStream.rangeClosed(1,s.length())
				.mapToObj(i->s.charAt(s.length()-i))
				.map(Object::toString)
				.collect(Collectors.joining());
				
		//return reverse(s.substring(1))+ s.charAt(0);
		/*
		String s3="";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1;i>=0;i++)*/
	}

}
