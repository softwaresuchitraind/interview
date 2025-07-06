package javainterview;

import java.util.Scanner;

public class DemoApp
{
	
	public void sayHello(String uname)
	{
		System.out.println("DemoApp.sayHello()");
		for(int i=0; i<=10;++i)
		{
			System.out.println(uname+" "+i);
		}
		System.out.println("End of sayHello()");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter msg");
		String msg = sc.next();
		displayMsg(msg);
	}
	public void displayMsg(String msg)
	{
		System.out.println("DemoApp.displayMsg()"+msg);
		System.out.println("DemoApp.displayMsg()"+msg);
		printNumbers(10);
	}
	public void printNumbers(int n)
	{
		System.out.println("DemoApp.printNumbers()");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		System.out.println("end");
	}
	public int add(int a,int b)
	{
		System.out.println("DemoApp.add()");
		return a+b;
	}
	public int sub(int a, int b)
	{
		System.out.println("DemoApp.sub()");
		return a-b;
	}
	
	public static void main(String[] args)
	{
		DemoApp app1 = new DemoApp();
		app1.sayHello("raja");
		app1.add(10, 20);
		app1.sub(20, 30);
	}
}
