package javainterview;

import java.util.HashMap;
//Nullvalue in HashMap

public class NullnHashMap
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<>();
		
		map.put(null, "first");
		map.put("A", null);
		map.put(null, "second");//overided
		map.put("B", null);
		
		System.out.println(map);
	}
}
