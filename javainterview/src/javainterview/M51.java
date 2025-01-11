package javainterview;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * // Count the number of occurance in a given String
 	{Hellow how are you}
 * */
public class M51
{
	public static void main(String[] args)
	{
		String str = "Hellow how are you how how you";
		Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
	}
}
