public sealed Class Stack
{
	private Node Top
	{
		get;
		set;
	}
	
	public Stack()
	{
		this.Top == null;
	}
	
	public void Push(Object data)
	{
		if (data == null)
		{
			return;
		}
		
		Node newNode = new Node(data);
		newnode.Next = Top;
		Top = newNode;
	}
	
	public Object Pop()
	{
		if (Top == null)
		{
			return null;
		}
		
		Object data = Top.Data;
		Top = Top.Next;
		return data;
	}
	
	public Object Peek()
	{
		if (Top == null)
		{
			return null;
		}
		
		return Top.Data;
	}
}

public class Node
{
	public Node Next
	{
		get; set;
	}
	
	public Object Data
	{
		get; set;
	}
	
	public Node(Object data)
	{
		if (data == null)
		{
			throw new ArgumentNullException("data");
		}
		
		this.Data = data;
		this.Next = null;
	}
}
