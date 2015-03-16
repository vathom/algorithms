public class MirrorBinaryTree
{
	public static void Main(String[] args)
	{
		Node root = New Node(1);
		Mirror();	
	}
	
	public static void Mirror(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		Mirror(root.left);
		Mirror(root.right);
		
		Node temp = root.right;
		root.right = root.left;
		root.left = temp;
	}
}