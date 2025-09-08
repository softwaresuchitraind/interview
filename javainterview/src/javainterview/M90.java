package javainterview;

import java.util.Arrays;
import java.util.List;

//Iterating List using lamda
public class M90
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Java","Spring","Lamda");
		list.forEach(i->System.out.println(i));
		
	}
}
