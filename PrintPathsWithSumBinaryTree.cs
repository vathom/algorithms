void PrintPaths(Node root, int sum)
{
	if (root == null)
	{
		return;
	}
	
	int height = GetHeight(root);
	int[] path = new int[height];
	int level = 0;
	PrintPaths(root, path, level, sum);
}

void PrintPaths(Node node, int[] path, int level, int sum)
{
	if(node == null)
	{
		return;
	}
	
	path.Add(node.val);
	int total = 0;
	for(int i=level; i>=0; i--)
	{
		total = total + path[i];
		if(total == sum)
		{
			PrintPath(path, i, level); //prints each element in path from i to level
		}
	}
	
	PrintPaths(node.left, path, level+1, sum);
	PrintPaths(node.right, path, level+1, sum);
}

int GetHeight(Node node)
{
	if(node == null)
	{
		return 0;
	}
	
	int leftHeight = GetHeight(node.left);
	int rightHeight = GetHeight(node.right);
	
	if (leftHeight > rightHeight)
	{
		return 1 + leftHeight;
	}
	
	return rightHeight + 1;
}
