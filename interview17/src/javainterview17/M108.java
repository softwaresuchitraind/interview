package javainterview17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

//2nd highest number
public class M108
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 45, 35, 30, 20, 15);
		Integer result = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new NoSuchElementException("It has no 2nd highest element"));

		System.out.println("Second Highest element " + result);

	}
}
