package javainterview;

public class M18
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2=reverse(s);
		System.out.println(s2);
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
