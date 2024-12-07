package javainterview;

// Reverse a String using Recursion
public class M33
{
	public static void main(String[] args)
	{
		String s = "hello";
		String reverseString=reverse(s);
		System.out.println(reverseString);
	}

	private static String reverse(String s)
	{
		if(s.isEmpty())
		{
			return "";
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
}
