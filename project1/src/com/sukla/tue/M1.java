package com.sukla.tue;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
suchitra
 find the first non repeated character
 */
public class M1
{
	public static void main(String[] args)
	{
		String s = "aabbcgcb";
		//Set set = new HashSet<>();
		//s.chars().mapToObj(x->(char)x).filter(ch->set.add(ch)).findFirst().ifPresent(System.out::println);
		
		 s.chars().mapToObj(x->(char)x)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1)
		.findFirst().ifPresent((x)->System.out.println("First repeting char :: "+x.getKey()));
		
		//first.ifPresent((x)->System.out.println("First repeting char :: "+x.getKey()));
		
		
	}

}
