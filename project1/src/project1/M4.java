package project1;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Array of characters
 
OutPut :
Map<Integer,Char>
key : index of character into aaray
value : character 
 * */
public class M4
{
	public static void main(String[] args)
	{
		
		char []ch = {'A','B','C','D','E'};
		
		Map<Integer, Character> map = new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(i, ch[i]);
		}
		
		for(Map.Entry<Integer, Character> entry : map.entrySet())
		{
			System.out.println("key :"+entry.getKey()+"Value "+entry.getValue());
		}
	}

}
