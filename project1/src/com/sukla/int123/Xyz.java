package com.sukla.int123;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Xyz
{
	public static void main(String[] args)
	{
		String s="we are in interview"; ///a=10,b=20,c=5 // [b=20,a=10,c=5]
			
		Map<Character, Long> map = s.chars().mapToObj(c->(char)c).map(x->x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(map);
	
		//collect.keySet().stream().sorted(Comparator.comparing(x->x.value())).forEach(System.out::Println);
	/*Map<Character, Long> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));*/
		/*
	Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	sortedMap.forEach((key,value)->System.out.println(key+"--"+value));*/
		
		
		String s2=reverse(s);
		System.out.println(s2);
	}

	
	private static String reverse(String s)
	{
		
		return IntStream.rangeClosed(1, s.length())
						.mapToObj(i->s.charAt(s.length()-i))
						.map(Object::toString)
						.collect(Collectors.joining());
	}
	
}


