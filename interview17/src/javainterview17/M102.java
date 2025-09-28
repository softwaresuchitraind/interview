package javainterview17;

//Finding Duplicate elements in an Array
public class M102
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 2, 4, 5, 1};
		boolean found = false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i] + " ");
					found = true;
					break;
				}
			}
		}
		if(!found)
		{
			System.out.println("NONE");
		}
	}
}
