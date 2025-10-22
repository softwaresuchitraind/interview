package javainterview17;

import java.util.List;
import java.util.stream.Collectors;

//Check for Anagram
public class M122
{
	public static void main(String[] args)
	{
		String str1 = "Dormitory";
		String str2 = "Dirty Room";
		boolean isAnagram = anaGram(str1).equals(anaGram(str2));

		System.out.println("Is Anagram   " + isAnagram);

	}

	private static List<Integer> anaGram(String str)
	{
		return str.toLowerCase().replaceAll("\\s+", "").chars().sorted().boxed().collect(Collectors.toList());
	}
}
