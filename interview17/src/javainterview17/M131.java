package javainterview17;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//First Non -repeating characters in a string
public class M131
{
	public static void main(String[] args)
	{
		String str = "abcassssbbbbbbkkkkkkk";
		Map<Character, Long> charfre = str.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charfre);
		
		Character nonRepertingchar = str.chars().mapToObj(c->(char)c)
					.filter(chr->charfre.get(chr)==1)
					.findFirst()
					.orElse(null);
		
		System.out.println("First non Repeating char  :"+nonRepertingchar);
		
		
	}
}
