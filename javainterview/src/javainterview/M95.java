package javainterview;

import java.util.HashMap;
import java.util.Map;

public class M95
{
	public static void main(String[] args)
	{
		Map<String,Integer> map= new HashMap<>();
		map.put("Java", 8);
		map.put("spring", 5);
		map.put("lamda", 1);
		map.forEach((k,v)->System.out.println(k+ " "+v));
	}
}
