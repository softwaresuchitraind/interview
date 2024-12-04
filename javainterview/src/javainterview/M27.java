package javainterview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find the first non -repeted character
 * String s = "aabbcgcb";
 * */
public class M27
{
	public static void main(String[] args)
	{
		String s = "aabbcgcb";
		
		s.chars()
		.mapToObj(x->(char)x)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1)
		.findFirst()
		.ifPresent(x->System.out.println("First non repeted char is :: "+x.getKey()));
	}
}
