package javainterview;

public class M89
{
	public static void main(String[] args)
	{
		Runnable r = ()->System.out.println("Hello,Lamda");
		new Thread(r).start();
	}
}
