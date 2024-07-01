
public class M12
{
	
	private  volatile static M12 INSTANCE; 
	
	private M12()
	{
		
		
	}
	
	public static  M12 getInstance()
	{
		
		if(INSTANCE==null)
		{
			synchronized(M12.class)
			{
				if(INSTANCE==null)
				{
					return new M12();
				}
				else
				{
					return INSTANCE;
				}
			}
		}
		return INSTANCE;
	}
	//public void readResolve()throws cloneNot

}
