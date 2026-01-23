package javainterview17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Finding the longest word in a string
public class M130
{
	public static void main(String[] args)
	{
		String str = "java8 stream make java enkoybelll";

		List<String> strList = Arrays.asList(str.split("\\s+"));
		System.out.println("Longest word in a String is ::" + strList.stream().max(Comparator.comparing(String::length)).orElse(""));
	}
}
