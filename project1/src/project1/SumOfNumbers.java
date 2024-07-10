package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbers
{
	public static void main(String[] args)
	{
		int i =6578;
		//int sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();
		//System.out.println(sum);
		List<Integer> l1 = new ArrayList<>();

		while(i!=0)
		{
			
			l1.add(0,i%10);
			i/=10;
		}
		System.out.println(l1);
		
		int sum = l1.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
