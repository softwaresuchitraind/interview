package project1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class M5
{
	public static void main(String[] args)
	{
		char []ch = {'A','B','C','D'};
		
		Map<Integer,Character> map = new HashMap<>();
		IntStream.range(0, ch.length).forEach(i->map.put(i, ch[i]));
		//print
		map.forEach((k,v)->System.out.println("key :"+k+"Value :"+v));
	}

}
