package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group words using 1st letter
public class M106
{
	public static void main(String[] args)
	{
		List<String> words = Arrays.asList("apple","banana","apricot","blueberry","cherry","avpcado");
		words.stream().collect(Collectors.groupingBy(w->w.charAt(0))).entrySet().forEach(System.out::println);
		
		
		
		
	}
	
	
	
}
