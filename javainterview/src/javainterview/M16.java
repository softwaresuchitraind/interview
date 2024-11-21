package javainterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * String str = "we are in interview";
 * 
 * Count the number of words using java 8 ?
 * */
public class M16
{
	public static void main(String[] args)
	{
		String str = "we are in interview";
		Map<Character, Long> map = str.chars()
			.mapToObj(ch->(char)ch)
			.map(x->x)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
