package com.sukla.tuetwo;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * */
public class M3
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"zbc");
		map.put(2,"aanana");
		map.put(3,"mango");

		map.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);
	}
}
