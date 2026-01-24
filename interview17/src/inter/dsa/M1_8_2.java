package inter.dsa;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
public class M1_8_2
{
	public static void main(String[] args)
	{
		int nums[] =
		{ 2, 7, 11, 15 };
		int target = 9;
		int[] result = 
				IntStream.range(0, nums.length)
				.boxed()
				.flatMap(i -> IntStream.range(i + 1, nums.length)
				.filter(j -> nums[i] + nums[j] == target)
				.mapToObj(j -> new int[]{ i, j }))
				.findFirst()
				.orElse(new int[] {});
		
		System.out.println(Arrays.toString(result));
	}

}
