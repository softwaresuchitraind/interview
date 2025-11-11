package javainterview17;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//sumOfAllDigits
public class M128
{
	public static void main(String[] args)
	{
		int number = 1234456522;
		Integer sum = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
	}
}
