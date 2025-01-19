package javainterview;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Find the Second Highest Salary
public class M56
{
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("Ajay", 5000);
		map.put("sanjay", 4000);
		map.put("kalu", 6000);
		map.put("malaya", 14000);

		Integer secondHighestSalary = map.values().stream().sorted(Comparator.reverseOrder()).distinct().skip(1)
				.findFirst().orElse(-1);
		
		System.out.println("Second Highest Salary is "+secondHighestSalary);
	}
}
