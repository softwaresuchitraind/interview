package com.sukla.inter5;

import java.util.Arrays;
import java.util.List;

//length if odd print using stream Api
public class M90
{
	public static void main(String[] args)
	{
		List<String>  list = Arrays.asList("hello","abc","xy","mnooo");
		list.stream().filter(x->!(x.length()%2==0)).forEach(System.out::println);
	}
}
