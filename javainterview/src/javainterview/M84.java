package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

//Java program to find the Element Occuring Most Times ?
public class M84
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,2,3,3,3,4,4);
		Optional<Entry<Integer, Long>> max = numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
		System.out.println(max);
	}
}
