package javainterview17;

import java.util.stream.IntStream;

//check a String is palliodrum or not
public class M123
{
	public static void main(String[] args)
	{
		String str = "racecar";
		
		boolean ispalloDrum = IntStream.range(0, str.length()/2)
										.allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		System.out.println(str+" is Pallioudrum ? "+ispalloDrum);
		
	}
}
