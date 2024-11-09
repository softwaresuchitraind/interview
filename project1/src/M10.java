
public class M10
{
	
	public static void main(String[] args) {
			
			Integer arr[] = {1,2,3,4,5,6,7,8};
			int sizeOfSubArray = 3;
			splitArray(arr, sizeOfSubArray);
			//arr[] = {1,2,3,4,5,6,7,8};
			//output
			//[1,2,3][4,5,6][7,8]
			
			//No collection framework
			//No math class methods
			//Create Object of array
			//

		}
		
		public static void splitArray(Integer arr[], int sizeOfSubArray) 
		{
			/*
			for(int i=0;i<arr.length;i++)
			{
				int []arr = new int[sizeOfSubArray];
			}*/
			int [] arr1 = new int[sizeOfSubArray];
			int [] arr2 = new int[sizeOfSubArray];
			for(int i=0;i<arr.length/3;i++)
			{
				arr1[i]=arr[i];
			}
			for(int i=arr.length/3;i<(arr.length/3)+3;i++)
			{
				arr2[i]=arr[i];
			}
			for(int i=(arr.length/3)+3;i<arr.length;i++)
			{
				arr2[i]=arr[i];
			}
			
		}
}
