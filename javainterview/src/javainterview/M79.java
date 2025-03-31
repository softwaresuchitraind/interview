package javainterview;

import java.util.Arrays;
import java.util.Comparator;
// Find the longest String in a array of String
public class M79
{
	public static void main(String[] args)
	{
		String[] strings = {"apple","banana","cherry","watermelon"};
		String longestString = Arrays.stream(strings).max(Comparator.comparing(String::length)).orElse("No String found");
		System.out.println(longestString);
	}
}
