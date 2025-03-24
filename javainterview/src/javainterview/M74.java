package javainterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the second most repeting word using stream API
public class M74
{
	public static void main(String[] args)
	{
		String s = "success";
		LinkedHashMap<Character, Long> charCount = s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(charCount);
		
		Character secondMost = charCount.entrySet().stream()
				 .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
				 .skip(1)
				 .findFirst()
				 .map(Map.Entry::getKey)
				 .orElse(null);
		
		System.out.println(secondMost);
				 
	}
}
