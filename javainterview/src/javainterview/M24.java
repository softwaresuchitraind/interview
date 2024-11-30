package javainterview;

import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * You are given a string for example. abbcfffccc
 *  print characters having highest count to lowest count.
"abbcfffccc"
 
c - 4
f - 3
b - 2
a - 1
 
 */
 
public class M24
{
	public static void main(String[] args)
	{
		String str = "abbcfffccc";
		 str.chars()
			.mapToObj(x->(char)x)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()
			.stream()
			.sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
			.forEach(System.out::println);
		
	}
}
