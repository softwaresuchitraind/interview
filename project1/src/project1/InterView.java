package project1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 
 * 	String input = "aaabbddddeabcde";
	String output = "a4b3c1d5e2";
 * */
public class InterView
{
	public static void main(String[] args)
	{
		String input = "aaabbddddeabcde";
		
		String s3 =outputString(input);
		System.out.println(s3);
		
	}

	private static String outputString(String input)
	{
		
			
		Map<Character, Long> collect = input.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);
		StringBuilder output = new StringBuilder();
		collect.forEach((character,count)->output.append(character).append(count));
		return output.toString();
	}

}
