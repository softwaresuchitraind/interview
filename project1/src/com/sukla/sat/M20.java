package com.sukla.sat;

public class M20
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				for(int i=0;i<10;i+=2)
				{
					System.out.println(i);
				}
				
			}
		});
		t1.start();
	}

}
