package javainterview17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 	Find first non-repeted character in string using java Streams.
 * */

public class M111
{
	public static void main(String[] args)
	{
		String input = "swiss";
		
		Character result = input.chars()
			 .mapToObj(x->(char)x)
			 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			 .entrySet()
			 .stream()
			 .filter(e->e.getValue()==1)
			 .map(Map.Entry::getKey)
			 .findFirst()
			 .orElse(null);
		
		System.out.println(result);
	}
}
