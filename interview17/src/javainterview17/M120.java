package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
//uppercase employee Names
public class M120
{
	public static void main(String[] args)
	{
		List<String> employee = Arrays.asList("Yogesh","Amol","Mahendra","Nayan");
		Function<String, String> toUpperCase =String::toUpperCase;
		List<String> upperCaseEmployee = employee.stream().map(toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase Employee Names "+upperCaseEmployee);
	}
}
