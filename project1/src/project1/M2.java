package project1;
//Print A to Z using Thread
import java.util.Arrays;
import java.util.List;

public class M2 
{
	
	public static void main(String[] args)
	{
		for(char ch='A';ch<='Z';ch++)
		{
			char finalch=ch;
			new Thread(()->System.out.println(finalch+" ")).start();
			
		}
		
	}

}
