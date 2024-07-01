
public class M15
{
	public static void main(String[] args)
	{
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	
	}

}
