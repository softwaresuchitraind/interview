package javainterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
//union and intersection of element
public class M48
{
	public static void main(String[] args)
	{
		Set<Integer> list1 = new HashSet<>(Arrays.asList(10,20,30,40));
		Set<Integer> list2 = new HashSet<>(Arrays.asList(30,40,50,60));
		
		//common element
		Set<Integer> set3 = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(set3);
		
		
		 list1.addAll(list2);
		 System.out.println(list1);
	}
}
