package javainterview;

import java.util.stream.Collectors;

/*
 * String str1 = "listen";
   String str2 = "silent";
   Check two Strings are anagram or not.
 * 
 * */
public class M82
{
	public static void main(String[] args)
	{
		String str1 ="listen";
		String str2 ="silent";
		
		boolean isAnagram = (str1.length() == str2.length())&& (sortedString(str1).equals(sortedString(str2)));
		
		System.out.println(isAnagram);
	}

	private static String sortedString(String str)
	{
		
		return str.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
	}
}
