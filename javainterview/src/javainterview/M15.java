package javainterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sort map by value in decending order using java 8
public class M15
{
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("C", 30);
		map.put("B", 20);
		
		LinkedHashMap<String, Integer> newMap = map.entrySet()
			.stream()
			.sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
			.collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		
		newMap.forEach((key,value)->System.out.println(key+"===="+value));
			
	}
}
