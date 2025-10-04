package javainterview;
/*
 * Print 1 to 10 using threads
 * */
public class M7 implements Runnable
{
	public static void main(String[] args)
	{
		Thread thread = new Thread(new M7());
		thread.start();
	}

	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}
