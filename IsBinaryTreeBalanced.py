def IsBinaryTreeBalancedBad(root):
    if root == None:
        return True;

    leftHeight = GetHeightBad(root.left)
    rightHeight = GetHeightBad(root.right)

    if |leftHeight-rightHeight| > 1:
        return False

    return IsBinaryTreeBalancedBad(root.left) and IsBinaryTreeBalancedBad(root.right)
        

def GetHeightBad(node):
    if node == None:
        return 0
    leftheight = GetHeightBad(node.left)
    rightheight = GetHeightBad(node.right)

    return 1 + Max(leftheight, rightheight)

#This is making unnecessary resursive calls. For every node we are calling get h#eight for every other node so the total calls is O(n2)

