package javainterview;
//using custom functional interface

@FunctionalInterface
interface Calculator
{
	int calculate(int a, int b);
}
public class M94
{
	public static void main(String[] args)
	{
		Calculator add =(a,b)->a+b;
		Calculator multiply =(a,b)->a*b;
		System.out.println("Addition "+add.calculate(5, 3));
		System.out.println("multiply "+add.calculate(5, 3));
	}
}
