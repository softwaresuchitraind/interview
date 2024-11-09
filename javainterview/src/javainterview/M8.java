package javainterview;
class Printer
{
	private static volatile Printer INSTANCE=null; 
	
	private Printer()
	{
		
	}
	
	public static Printer getInstance()
	{
		if(INSTANCE== null)
		{
			synchronized(Printer.class)
			{
				if(INSTANCE== null)
				{
					INSTANCE = new Printer();
				}
			}
		}
		return INSTANCE;
	}
	public void Print()
	{
		System.out.println("Printing--------");
	}
	
}
public class M8
{
	public static void main(String[] args)
	{
		Printer p1 =Printer.getInstance();
		Printer p2 =Printer.getInstance();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
