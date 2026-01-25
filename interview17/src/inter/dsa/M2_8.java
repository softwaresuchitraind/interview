package inter.dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * */
public class M2_8
{
	public static void main(String[] args)
	{
		int nums[] = {1,2,3,4};
		System.out.println("Initial Array :"+Arrays.toString(nums));
		IntStream.range(1, nums.length)
				 .forEach(i->nums[i]+=nums[i-1]);
		System.out.println("Final Array :"+Arrays.toString(nums));
	}
}
