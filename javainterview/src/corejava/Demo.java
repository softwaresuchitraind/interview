package corejava;

public class Demo implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Demo d = new Demo();
		Object object = d.clone();
		Demo d2 = (Demo)object;//narrowing or downcasting
	}
}
