package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given two list merge them and remove duplicates
public class M93
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("java","spring","kafka","docker");
		List<String> list2 = Arrays.asList("qarus","java","spring","oracle");
		List<String> mergedDistinct = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println("Merged List ::"+mergedDistinct);
		
	}
}
