package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//frequency of each number
public class M109
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple","banana","orange","apple","banana");
		Map<String, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
	}
}
