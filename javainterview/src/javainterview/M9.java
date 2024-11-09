package javainterview;
//Binary Search in java
public class M9
{
	public static void main(String[] args)
	{
		int arr[] = {2,4,5,10,15,23,35,40};
		int target = 10;
		int i=binarySearch(arr,target);
		if(i!=-1)
		{
			System.out.println(target+"is found in "+i+" index");
		}
		else
		{
			System.out.println(target+"is not found");
		}
		
	}

	private static int binarySearch(int[] arr, int target)
	{
		int left = 0;
		int right = arr.length-1;
		
		int mid = left+(right-left)/2;
		
		while(left<=right)
		{
			if(target==arr[mid])
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				right=mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}
}
