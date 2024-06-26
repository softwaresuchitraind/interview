package project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		Count the max subArray 
		Answer will be 7.
 * */
public class SubArray1
{
	public static void main(String[] args)
	{
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				sum+=a[i];
			}
			list.add(sum);	
		}
		Optional<Integer> maxSubArray=list.stream()
				.collect(Collectors.maxBy(
						Comparator.comparing(Function.identity())));
		if(maxSubArray.isPresent())
		{
			System.out.println(maxSubArray.get());
		}


	}

}
