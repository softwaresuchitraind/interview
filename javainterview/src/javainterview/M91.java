package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filtering a list with lamda
public class M91
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Java", "JavaScript","Python");
		List<String> filteredList = list.stream()
			.filter(s->s.startsWith("J"))
			.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}
}
