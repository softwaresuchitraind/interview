
public class M11
{
	public static void main(String[] args)
	{
		
		
		Thread t1 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				M11.printOneTwoTen();
				
			}
		});
		t1.start();
		
		Thread t2 = new Thread(()->
		{
			M11.printOneTwoTen1();
				
			
		});
		t2.start();
		
		
		
	}
	
	
	private static synchronized void printOneTwoTen()
	{
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i);
		}
		
	}
	private static synchronized void printOneTwoTen1()
	{
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i);
		}
		
	}
	

	
}
