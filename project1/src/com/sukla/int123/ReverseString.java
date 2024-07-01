package com.sukla.int123;

public class ReverseString
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]= temp;
			
		}
		String s2 = new String(ch);
		System.out.println(s2);
	}
}
