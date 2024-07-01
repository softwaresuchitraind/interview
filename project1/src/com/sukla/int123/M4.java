package com.sukla.int123;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * [confounded, incumbent, jailer, perjury, skimming, sporadic]

	List<String> phrases = Arrays.asList(
        "sporaacdic perjury",
        "confounded skimming",
        "incumbent jailer",
        "confounded jailer");
 * */
public class M4
{
	public static void main(String[] args)
	{
		List<String> phrases= Arrays.asList("sporaacdic perjury","confounded skimming","incumbent jailer","confounded jailer");
		
		List<String> collect = phrases.stream().flatMap(p->Arrays.stream(p.split(" "))).map(x->x).sorted().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
