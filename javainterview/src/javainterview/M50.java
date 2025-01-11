package javainterview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Count number of letters in the String
public class M50
{
	public static void main(String[] args)
	{
		String str = "My name is Suchitra Kumar Sukla";
		String[] strArr = str.split("");
		Map<String, Long> map = Arrays.stream(strArr).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
