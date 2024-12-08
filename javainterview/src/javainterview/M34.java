package javainterview;

//Reverse String without using predefined function
public class M34
{
	public static void main(String[] args)
	{
		String s = "hello";
		char[] str = s.toCharArray();
		
		for(int i=0;i<str.length/2;i++)
		{
			char temp = str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]= temp;
		}
		String revStr=new String(str);
		System.out.println(revStr);
	}
}
