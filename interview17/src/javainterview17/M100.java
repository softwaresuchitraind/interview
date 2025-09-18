package javainterview17;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * How to calculate count,sum,min,max and average of marks in just one stream operation ?
 * */
public class M100
{
	public static void main(String[] args)
	{
		List<Integer> Marks = List.of(85,90,78,95,88);//java 9
		IntSummaryStatistics stats = Marks.stream().collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println("Counts: "+stats.getCount());
		System.out.println("Sum: "+stats.getSum());
		System.out.println("Min: "+stats.getMin());
		System.out.println("Max: "+stats.getMax());
		System.out.println("Average: "+stats.getAverage());
		
	}
}
