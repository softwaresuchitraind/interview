package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Write a java program to ZIP two lists into a Map,where one has character and one has number.
 * */
public class M83
{
	public static void main(String[] args)
	{
		List<String> keys = Arrays.asList("A","B","C");
		List<Integer> values = Arrays.asList(1,2,3);
		
		Map<String, Integer> zipped = IntStream.range(0, Math.min(keys.size(), values.size()))
				 .boxed()
				 .collect(Collectors.toMap(keys::get, values::get));
		
		System.out.println(zipped);
		
	}
}
