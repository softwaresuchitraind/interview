package com.sukla.projone;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they can  add up to the target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use same element twice
 * 
 * you can return the answer in any order.
 * 
 * Example
 * Input : nums = [2,7,11,15], target =9
 * Output :[0,1]
 * Output: Because num[0] + num[1] ==9, we return [0,1].
 * 
 * in java
 * */
public class M3
{
	public static void main(String[] args)
	{
		int nums[] = {2,7,11,15};
		int target = 9;
		M3 m3 = new M3();
		int result[] =m3.sumTwoArrays(nums,target);
		//print result
		System.out.println("["+result[0]+","+result[1]+"]");
	}

	private int[] sumTwoArrays(int[] nums, int target)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++)
		{
			int competent = target-nums[i];
			if(map.containsKey(competent))
			{
				return new int[] { map.get(competent),i };
			}
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two Sum Solution");
	}

}
