package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * How many times each word repeted
 * List<String> list5 =Arrays.asList("hello","abc","india","duty","bangalore","hello","india","india");
 * */
public class M45
{
	public static void main(String[] args)
	{
		List<String> list =Arrays.asList("hello","abc","india","duty","bangalore","hello","india","india");
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
