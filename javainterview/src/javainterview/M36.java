package javainterview;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * String s = "convert first letter to upper case ";
 * */
public class M36
{
	public static void main(String[] args)
	{
		String s = "convert first letter to upper case ";
		String[] chs = s.split(" ");
		String s1 = Arrays.stream(chs).map(x->x.substring(0, 1).toUpperCase()+x.substring(1)).collect(Collectors.joining(" "));
		System.out.println(s1);
	}
}
