Node Partition(Node head, int x)
{
	if(head == null)
	{
		return null;
	}
	
	Node before = null;
	Node after = null;
	
	while(head != null)
	{
		Node next = head.next;
		if(head.val < x)
		{
			head.next = before;
			before = head;			
		}
		else
		{
			head.next = after;
			after = head;
		}
		head = next;
	}
	
	if(before == null)
	{
		return after;
	}
	
	Node newHead = before;
	
	while(before.next ! = null)
	{
		before = before.next;
	}
	
	before.next = after;
	
	return newHead;
}