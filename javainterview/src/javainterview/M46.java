package javainterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class M46
{
	public static void main(String[] args)
	{
		List<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		List<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(40);
		a2.add(30);
		List<Integer> a3 = new ArrayList<>();
		a3.add(10);
		a3.add(40);
		a3.add(50);
		
		List<Integer> list=uniqueElements(a1,a2,a3);
		System.out.println(list);
	}

	private static List<Integer> uniqueElements(List<Integer> a1, List<Integer> a2, List<Integer> a3)
	{
		Set<Integer> set = new HashSet<>();
		set.addAll(a1);
		set.addAll(a2);
		set.addAll(a3);
		return new ArrayList<>(set);
	}
}
