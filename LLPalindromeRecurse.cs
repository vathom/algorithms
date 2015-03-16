Result IsPalindromeRecurse(Node head, int length)
{	
	if(head == null || length==0)
	{
		return new Result(null, true);
	}
	if(length==1)
	{
		return new Result(head.Next, true);
	}
	if(length==2)
	{
		return new Result(head.Next.Next, head.Val == head.Next.Val); 
	}
	
	Result res = IsPalindromeRecurse(head.Next, length-2);
	
	if (! res.Result)
	{	
		return res;
	}
	
	else
	{
		return new Result(res.Node.Next, head.Val == res.Node.Val);
	}
}

class Result
{	
	public LinkedListNode Node;
	public bool Result;
	public int Val;
	
	public Result(LinkedListNode node, bool result)
	{
		this.Node = node;
		this.Result = result;
	}
}