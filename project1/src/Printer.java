//Singleton
public class Printer
{
	private static volatile Printer INSTANCE=new Printer();
	
	private Printer()
	{
		
	}
	
	public static Printer getInstance()
	{
		if(INSTANCE==null)
		{
			
			synchronized(Printer.class)
			{
				if(INSTANCE==null)
				{
					return new Printer();
				}
			}
			
		}
		return INSTANCE;
	}
	

	void print()
	{
		System.out.println("printling............");
	}
	
	
	

}
