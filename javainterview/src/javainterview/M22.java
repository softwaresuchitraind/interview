package javainterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Repeted Characters using java8
public class M22
{
	public static void main(String[] args)
	{
		String s = "programming";
		Map<Character, Long> collect = s.chars().mapToObj(x->(char)x)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				 .entrySet()
				 .stream()
				 .filter(x->x.getValue()>1)
				 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(collect);
	}
}

/*
 * {r=2, g=2, m=2}
 * */
