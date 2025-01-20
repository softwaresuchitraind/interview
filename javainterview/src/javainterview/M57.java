package javainterview;

import java.util.Arrays;

//Arrange the list element in sorted order
public class M57
{
	public static void main(String[] args)
	{
		Arrays.asList(10,20,40,5,35,50,34).stream().sorted().forEach(System.out::println);
	}
}
