package javainterview;

import java.util.stream.Collectors;

/*
 * Check if a string has all unique characters using java 8 streams
 * */
public class M97
{
	public static void main(String[] args)
	{
		String input = "stream";
		int size = input.chars().mapToObj(c->(char)c).collect(Collectors.toSet()).size();
		if(size == input.length())
		{
			System.out.println("The inputed String contails all unique characters");
		}
		else
		{
			System.out.println("there is duplicate");
		}
	}
}
