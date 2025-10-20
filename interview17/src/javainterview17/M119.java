package javainterview17;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//prime numbers between 1 to 20 using stream
public class M119
{
	public static void main(String[] args)
	{
		List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
		System.out.println(numbers);
		
		Predicate<Integer> isPrime=num->num > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(n->num %n  !=0);
		
		List<Integer> primes = numbers.stream().filter(isPrime).collect(Collectors.toList());
		
		System.out.println("Prime Numbers "+primes);
	}
}
