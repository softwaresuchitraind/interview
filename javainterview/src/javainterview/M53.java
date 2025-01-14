package javainterview;
//Reverse String
public class M53
{
	public static void main(String[] args)
	{
		String s = "hello";
		char[] chs = s.toCharArray();
		String s2 = "";
		for(int i=chs.length-1;i>=0;i--)
		{
			s2+=chs[i];
		}
		
		System.out.println("Reverse String is :: "+s2);
	}
}
