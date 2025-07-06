package javainterview;

import java.util.HashMap;
import java.util.stream.Collectors;

//sort map based on values
public class M31
{

	public static void main(String[] args)
	{
		HashMap<Integer, String > map = new HashMap<>();
		map.put(101, "bbb");
		map.put(102, "kbb");
		map.put(103, "sbb");
		map.put(104, "abb");
		
		map.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);
	}
}
