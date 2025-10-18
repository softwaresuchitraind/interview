package javainterview17;

import java.util.Arrays;
import java.util.StringJoiner;

//readable output using joiner
public class M116
{
	public static void main(String[] args)
	{
		String[] categories = {"Electronics","Book","Clothing","Home"};
		StringJoiner joiner = new StringJoiner(", ");
		Arrays.stream(categories).forEach(joiner::add);
		
		System.out.println("Categories :: "+joiner);
		
	}
}
