package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Remove Consecutive Duplicate elements
public class M107
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,3,5,5,9,2,7,7,8,5);
		List<Integer> result = IntStream.range(0, list.size())
				 .filter(i->i==0 ||!list.get(i).equals(list.get(i-1)))
				 .mapToObj(list:: get)
				 .collect(Collectors.toList());
		
		System.out.println("Origional List" +list);
		System.out.println("Modified List" +result);
				 
	}

}
