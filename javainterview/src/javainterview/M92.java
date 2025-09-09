package javainterview;

import java.util.Arrays;
import java.util.List;

//Sorting a list using Lamda
public class M92
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Java","lamda","kafka");
		list.sort((s1,s2)->s1.compareTo(s2));
		list.forEach(System.out::println);
	}
}
