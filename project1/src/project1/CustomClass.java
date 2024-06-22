package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * List<String> strings = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
 * */
public class CustomClass
{
	public static void main(String[] args)
	{
		List<String> strings = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
		strings.stream().filter(x->x.startsWith("a")).forEach(System.out::println);
		
		int [] a = {56,20,30};
		int [] b = {10,20,30,40,50};
		
		boolean b1=printArrayElement(a,b);
		System.out.println(b1);
	}

	private static boolean printArrayElement(int[] a, int [] b)
	{
	
		
	/*
		for(int i=0;i<a.length;i++)
		{
			boolean found =false;
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])
				{
					found =true;
					break;
				}
				
			}
			if(!found)
			{
				return false;
			}
			
		}
		return true;
		
		
	}
	*/
		return Arrays.stream(a).allMatch(elementA->Arrays.stream(b).anyMatch(elementB->elementA==elementB));

}
}
