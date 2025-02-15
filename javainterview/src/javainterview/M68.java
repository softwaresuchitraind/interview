package javainterview;
//find out min value from all even indexed element
public class M68
{
	public static void main(String[] args)
	{
		int arr[] = {5,15,50,3,45,89,10,25};
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i+=2)
		{
			if(min<arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("Minimum Value from all even indexed element "+min);
	}
}
