package project1;

import java.util.Arrays;
import java.util.List;

public class M2 
{
	
	public static void  printAlphabet(String s)
	{
		synchronized(M2.class)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args)
	{
		List<String> asList = Arrays.asList("A","B","C","D","E","F","G");
		Thread t1 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				 
				
			}
		});
		t1.start();
		
		
	}

}
