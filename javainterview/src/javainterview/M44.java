package javainterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//print list of list using java 8
public class M44
{
	public static void main(String[] args)
	{
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		list.add(list1);
		list.add(list2);
		list.add(list3);
		
		List<Integer> list4 = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(list4);
	}
}
