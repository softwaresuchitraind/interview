package inter.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/*
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
*/
public class M1_8
{
	public static void main(String[] args)
	{
		int nums[] =
		{ 2, 7, 11, 15 };
		int target = 9;
		int arr[] = twoSum_8(nums, target);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] twoSum_8(int nums[], int target)
	{
		Map<Integer, Integer> map = new HashMap<>();

		return IntStream.range(0, nums.length).filter(i ->
		{

			int competent = target - nums[i];
			if (map.containsKey(competent))
			{
				return true;
			}
			map.put(nums[i], i);
			return false;

		}).mapToObj(i -> new int[]
		{ map.get(target - nums[i]), i }).findFirst().orElse(new int[]
		{});

	}
}
