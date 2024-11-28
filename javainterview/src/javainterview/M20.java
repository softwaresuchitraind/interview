package javainterview;

import java.util.Arrays;
import java.util.List;

//Find odd length of the String
public class M20
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("hello","abc","bbsr","joker","marathali");
		list.stream().filter(x->!(x.length()%2==0)).forEach(System.out::println);
	}

}
