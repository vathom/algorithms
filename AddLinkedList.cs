public Node AddLinkedList(Node node1, Node node2)
{
	if(node1 == null && node2 == null)
	{
		return null;
	}
	
	if(node1 == null)
	{
		return node2;
	}
	
	if(node2 == null)
	{
		return node1;
	}

	int len1 = GetLength(node1);
	int len2 = GetLength(node2);

	Node head= null;
	
	if(len1 < len2)
	{
		node1 = Pad(node1, len2-len1);
	}
	else if(len2 < len1)
	{
		node2 = Pad(node2, len1-len2)
	}
	else
	{
		head = AddPadded(node1, node2);
	}
	
	if(head.Carry == 1)
	{
		Node newHead = new Node();
		newHead.Data = head.Carry;
		newHead.Next = head;
		return newHead;
	}
	else
	{
		return head;
	}
}

public Node AddPadded(Node node1, Node node2)
{
	if(node1 == null && node2 == null)
	{	
		return null;
	}
	
	Node current = new Node();
	
	Node n = AddPadded(node1 == null? null: node1.Next, node2==null? null:node2.Next);
	
	int sum = 0;
	
	if (n!=null)
	{
		sum += n.carry;
	}
	
	if(node1 != null)
	{
		sum += node1.Data;
	}
	
	if(node2 != null)
	{
		sum += node2.Data;
	}
	
	int val = sum%10;
	int carry = val > 10? 1: 0;
	current.Data = val;
	current.Carry = carry;
	current.Next = n;
	return current;
}


public class Node
{
	public Node Next
	{
		get; set;
	}
	
	public int Data
	{
		get; set;
	}
	
	public int Carry
	{
		get; set;
	}
	
	public Node()
	{
		this.Data = 0;
		this.Carry = 0;
		this.Next = null;
	}
}