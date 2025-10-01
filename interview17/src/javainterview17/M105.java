package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group words using 1st letter
public class M105
{
	public static void main(String[] args)
	{
		List<String> words = Arrays.asList("apple","banana","apricot","blueberry","cherry","avpcado");
		Map<Character, List<String>> grouped = words.stream().collect(Collectors.groupingBy(w->w.charAt(0)));
		
		//print using method references
		grouped.forEach(M105::printgroup);
		
		
	}
	
	private static void printgroup(Character ch, List<String> list)
	{
		System.out.println(ch + "->" +String.join(", ", list));
		
	}
	
}
