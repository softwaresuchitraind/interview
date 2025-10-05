package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//using flatmap to process nested list
public class M113
{
	public static void main(String[] args)
	{
		List<List<String>> subject = Arrays.asList(Arrays.asList("DBMS","Operationg System"),Arrays.asList("Mathematics","IOC"),Arrays.asList("Computer Networks","compiler Design"));
		
		Set<String> result = subject.stream()
			.flatMap(List::stream)
			.distinct()
			.collect(Collectors.toSet());
		
		System.out.println(result);
	}
}
