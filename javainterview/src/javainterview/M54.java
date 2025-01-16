package javainterview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//reverse String using java8
public class M54
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = IntStream.range(0, s.length()).mapToObj(i->s.charAt(s.length()-i-1)).map(Object::toString).collect(Collectors.joining());
		System.out.println(s2);
	}
}
