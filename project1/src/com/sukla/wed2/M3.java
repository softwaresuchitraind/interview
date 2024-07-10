package com.sukla.wed2;

public class M3
{
	public static void main(String[] args)
	{
		String s = "hello";
		char[] str = s.toCharArray();
		for(int i=0;i<str.length/2;i++)
		{
			char temp= str[i];
			str[i]= str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		System.out.println(str);
		String s3 = new String(str);
		System.out.println(s3);
	}
}
