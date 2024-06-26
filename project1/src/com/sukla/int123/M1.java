package com.sukla.int123;
class Duty
{
	void calculateDuty()
	{
		System.out.println("Duty calculated ASIA");
	}
}
public class M1 extends Duty
{
	void calculateDuty()
	{
		System.out.println("Duty calculated USA");
	}
	public static void main(String[] args)
	{
		Duty d1 = new Duty();
		d1.calculateDuty();
	}
}
