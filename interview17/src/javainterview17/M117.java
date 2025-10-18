package javainterview17;

import java.util.List;

/*
 * Extract strings that start with a number using java stream.
 * 
 * */


public class M117
{
	public static void main(String[] args)
	{
		List<String> names = List.of("5java","python","3C","C++","1Ruby");
		List<String> filterednames = names.stream()
			 .filter(name->Character.isDigit(name.charAt(0)))
			 .toList();
		System.out.println(filterednames);
	}
}
