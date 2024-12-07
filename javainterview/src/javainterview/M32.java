package javainterview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//reverse a String using java 8
public class M32
{
	public static void main(String[] args)
	{
		String s = "hello";
		String reverseString = IntStream.range(0, s.length())
				 .mapToObj(i->s.charAt(s.length()-1-i))
				 .map(Object::toString)
				 .collect(Collectors.joining());
		
		System.out.println("Reverse of "+s+"is "+reverseString);
	}
}
