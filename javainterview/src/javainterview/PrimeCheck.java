package javainterview;

import java.util.Arrays;
import java.util.List;

/*
 * Given a list of integers, how do you check whether it contains any prime numbers using Streams
 * */
public class PrimeCheck
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(4,54,2,6,15,16);
		boolean containPrime=numbers.stream().anyMatch(PrimeCheck::isPrime);
		System.out.println(containPrime);
	}
	public static boolean isPrime(int num)
	{
		if(num <=1 ) 
			return false;
		for(int i =2; i<=Math.sqrt(num);i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
