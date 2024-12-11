package javainterview;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//print odd and even using Thread
public class M38
{
	private static Object object = new Object();
	private static IntPredicate evenPredicate = i->i%2==0;
	private static IntPredicate oddPredicate = i->i%2!=0;
	
	public static void execute(int i)
	{
		synchronized(object)
		{
			System.out.println(Thread.currentThread().getName()+"--------------"+i);
			
			try
			{
				object.notify();
				object.wait();
			} catch (InterruptedException e)
			{
				
			}
		}
	}
	
	public static void results(IntPredicate condition)
	{
		IntStream.rangeClosed(1, 10).filter(condition).forEach( M38::execute);
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		CompletableFuture.runAsync(()->M38.results(oddPredicate));
		CompletableFuture.runAsync(()->M38.results(evenPredicate));
		Thread.sleep(1000);
	}
}
