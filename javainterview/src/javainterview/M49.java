package javainterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * String s = "abcabcdt";
 * Find first non-repeted character using java 8
 * */
public class M49
{
	public static void main(String[] args)
	{
		String s = "abcabcdt";
		Character firstNonRepeat = s.chars().mapToObj(x->(char)x)
				 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				 .entrySet()
				 .stream()
				 .filter(entry->entry.getValue()==1)
				 .map(Map.Entry::getKey)
				 .findFirst()
				 .orElse('\0');
		
		System.out.println("First Non-repeted Character :: "+firstNonRepeat);
		
	}
}
