package com.sukla.sun;

/*
 * 
 * Coin Change: Given a set of coin denominations and a total amount,
 *  find the minimum number of coins needed to make up that amount.

Given an integer array of coins[ ] of size N representing different types of denominations
 and an integer sum, the task is to count all combinations of coins to make a given value sum.  

Note: Assume that you have an infinite supply of each type of coin. 

Examples: 

Input: sum = 4, coins[] = {1,2,3,4}, n C r

Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}. 

Input: sum = 10, coins[] = {2, 5, 3, 6} //4*3/2 
Output: 5
Explanation: There are five solutions: 
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
 * */

public class Tue1
{
	public static void main(String[] args)
	{
		int coins[] = {1,2,3};
		int sum =4;
		int count=0;
		
		for(int i=0;i<coins.length;i++)
		{
			for(int j=i+1;j<coins.length;j++)
			{
				if(coins[i]+coins[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.println("No of combinations:"+coins.length+1);
	}
}
