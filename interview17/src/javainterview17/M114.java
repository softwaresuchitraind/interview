package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//top 5 frequent element
public class M114
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,1,2,3,4,5,6,2,6,4,2,3,4,2,3,4);
		List<Integer> result = list.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()
			.stream()
			.sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
			.limit(5)
			.map(Map.Entry::getKey)
			.toList();
		
		System.out.println("top 5 lement with frequency" +result);
			
	}
}
