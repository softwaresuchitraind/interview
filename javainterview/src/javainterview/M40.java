package javainterview;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

//First Repeating character using java 8
public class M40
{
	public static void main(String[] args)
	{
		String s = "hello";
		Optional<Character> ch=firstRepeat(s);
		System.out.println(ch.isPresent() ? "First Repeating character is " + ch.get() : "No repeating character"); 
		
		/*
		if(ch.isPresent())
		{
			System.out.println("First Repeating character is "+ch.get());
		}
		else
		{
			System.out.println("No repeating Character ");
		}*/

	}

	private static Optional<Character> firstRepeat(String s)
	{
		Set<Character> set = new HashSet<>();
		return IntStream.range(0, s.length()).mapToObj(s::charAt).filter(ch -> !set.add(ch)).findFirst();

	}
}
