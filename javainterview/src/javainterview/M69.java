package javainterview;

//Insert an element in the Sorted Array
public class M69
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 5, 10, 25, 50, 80 };

		int numToInsert = 7;
		int i = 0;

		int newArray[] = new int[arr.length + 1];
		while (i < arr.length && arr[i] < numToInsert)
		{

			newArray[i] = arr[i];
			i++;
		}
		newArray[i]=numToInsert;
		for(int j=i;j<arr.length;j++)
		{
			newArray[j+1]=arr[j];
		}
		
		//final Array
		for(int k=0;k<newArray.length;k++)
		{
			System.out.print(newArray[k]+" ");
		}
		
	}
}
