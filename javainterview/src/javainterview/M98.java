package javainterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Increase each value[Marks] of a map by 5
 * */
public class M98
{
	public static void main(String[] args)
	{
		//Map<String, Integer> marks = new HashMap<>();//updated marks: {priya=95, Neha=83, Amit=90}
		//Map<String, Integer> marks = new LinkedHashMap<>();//updated marks: {Amit=90, priya=95, Neha=83}
		Map<String, Integer> marks = new TreeMap<>();//updated marks: {Amit=90, Neha=83, priya=95}
		marks.put("Amit", 85);
		marks.put("priya", 90);
		marks.put("Neha", 78);
		
		//increase marks by 5
		
		/**
		 * @param BiFunction 
		 */
		marks.replaceAll((name,score)->score+5);
		
		System.out.println("updated marks: "+marks);
	}
}
