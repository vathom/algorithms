class Node:
    left = None
    right = None
    val = 0

val = []
def bt_path_sum(root, sum):
    if root == None:
        return


def depth(root):

    if root == None:
        return 0

    return 1 + Max(depth(root.left), depth(root.right))
