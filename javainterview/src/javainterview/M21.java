package javainterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Create a Map Print Using for-each Loop , Java 8 and while Loop
public class M21
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "hello");
		map.put(3, "world");
		map.put(5, "teja");
		map.put(6, "sam");
		map.put(8, "sundar");
		
		//Print using for-each loop
		System.out.println("Print Using for-each loop");
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println("Print using Map :: key: "+entry.getKey()+"value"+entry.getValue());
		}
		
		System.out.println("print using java8");
		map.forEach((k,v)->System.out.println("key:"+k+"value:"+v));
		
		//printing Map using Iterator
		
		System.out.println("Printing Using While Loop");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("key :"+entry.getKey()+"Value :"+entry.getValue());
		}
			
	}
}
