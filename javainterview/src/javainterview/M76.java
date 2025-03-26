package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find the third largest element in a list ?
public class M76
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,20,50,40,30);
		Integer nthlargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
		System.out.println(nthlargest);
		
	}
}
