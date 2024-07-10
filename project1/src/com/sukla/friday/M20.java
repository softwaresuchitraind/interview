package com.sukla.friday;

public class M20
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(() ->
		{
			System.out.println("Hello");

		});
		t1.start();
	}

}
