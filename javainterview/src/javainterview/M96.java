package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 *	Using Streams, filter out consecutive duplicates from a given list 
 * 
 * */
public class M96
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,3,2,1,4,5,5,4,6);
		List<Integer> result = IntStream.range(0, list.size())
				 .filter(i->i == 0 || ! list.get(i).equals(list.get(i-1)))
				 .mapToObj(list :: get)
				 .collect(Collectors.toList());
		
		System.out.println("origional List : "+ list);
		System.out.println("After removing duplicates : "+ result);
		
	}
}
