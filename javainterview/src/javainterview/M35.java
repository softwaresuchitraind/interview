package javainterview;

import java.util.stream.Stream;

//print first 20 even numbers using java 8
public class M35
{
	public static void main(String[] args)
	{
		Stream.iterate(2, n->n+2).limit(20).forEach(System.out::println);
	}
}
