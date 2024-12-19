package javainterview;
//Sum of two numbers using Lamda Expression

@FunctionalInterface
interface sum
{
	int add(int a, int b);
}
public class M47
{
	public static void main(String[] args)
	{
		sum s1=(a,b)->a+b;
		int i = s1.add(10, 20);
		System.out.println(i);
	}
}
