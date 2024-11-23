package javainterview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class M17
{
	public static void main(String[] args)
	{
		String s = "suchitra kumar sukla";
		String s2=reverse(s);
		System.out.println(s2);
	}

	private static String reverse(String s)
	{
		return IntStream.rangeClosed(1, s.length())
				 .mapToObj(i->s.charAt(s.length()-i))
				 .map(Object::toString)
				 .collect(Collectors.joining());
		
	}
}
