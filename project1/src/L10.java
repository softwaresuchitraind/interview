class Node
{
	int i;
	Node ref;
	Node(int i)
	{
		this.i=i;
	}
}
class LinkedList
{
	Node first;
	Node last;
	public void add(int i)
	{
		Node element = new Node(i);
		if(first==null)
		{
			first=element;
		}
		else
		{
			last.ref=element;
		}
		last=element;
	}
	public void iterate()
	{
		Node current=first;
		while(current!=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
	
}

public class L10
{
	public static void main(String[] args)
	{
		LinkedList l1 =new LinkedList();
		l1.add(20);
		l1.add(30);
		l1.add(49);
		l1.iterate();
		l1.delete();
		l1.iterate();
		
	}
}