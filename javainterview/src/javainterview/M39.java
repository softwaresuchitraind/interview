package javainterview;

import java.util.HashSet;
import java.util.Set;

//First Repeting Character in a String
public class M39
{
	public static void main(String[] args)
	{
		String s = "helloe";
		Character s1 = firstRepeatChar(s);
		System.out.println("First Repeating Character is :: "+s1);
	}

	private static Character firstRepeatChar(String s)
	{
		Set<Character> hashSet = new HashSet<>();
		for (char ch : s.toCharArray())
		{
			if (hashSet.contains(ch))
			{
				return ch;
			}
			hashSet.add(ch);
		}

		return null;
	}
}
