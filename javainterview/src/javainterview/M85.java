package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//print the 4 longest string from the list in decreasing order
public class M85
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList(
				"Artificial Intelligence",
				"Data Science",
				"Machine Learning",
				"Java",
				"Cloud Computing",
				"Big Data",
				"Microservices",
				"Spring Boot"
				);
		
		List<String> fourLongestString = list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(4).collect(Collectors.toList());
		System.out.println(fourLongestString);
	}
}
