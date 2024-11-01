package javainterview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find the highest String along with length using java8
 * { "apple", "banana", "promagnate", "grape" }
 * */
public class M1
{
	public static void main(String[] args)
	{
		String []str = {"apple","banana","promagnate","grape"};
		Arrays.stream(str).collect(Collectors.toMap(Function.identity(), String::length))
							.entrySet()
							.stream()
							.sorted((e1,e2)->e2.getValue()-e1.getValue())
							.findFirst()
							.ifPresent(System.out::println);
						  
	}
}
