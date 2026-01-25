package inter.dsa;

import java.util.Arrays;

/*
 * richest customer wealth
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
		Output: 17
 
 * 
 * */

public class M3_8
{
	public static void main(String[] args)
	{
		int arr[][] = {{2,8,7},{7,1,3},{1,9,5}};
		int result = Arrays.stream(arr)
			  .mapToInt(customer->Arrays.stream(customer).sum())
			  .max()
			  .getAsInt();
		System.out.println("Rishest customer Wealth :"+result);
	}

}
