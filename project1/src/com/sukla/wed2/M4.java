package com.sukla.wed2;
//first 20 even numbers
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class M4
{
	public static void main(String[] args)
	{
		int count =1;
		List<Integer> list = Arrays.asList();
		for(int i=0;i<100;i++)
		{
			list.add(i);
			/*
			if(i%2==0 && count !=20)
			{
				System.out.println(i);
				count++;
			}*/
		}
		
		list.stream().filter(i->i%2==0 && count !=20).forEach(System.out::println);
	}

}
