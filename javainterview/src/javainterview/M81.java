package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Second Highest Number in a List 
public class M81
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		Optional<Integer> secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(secondHighest.get());
	}
}
