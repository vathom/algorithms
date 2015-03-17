class Node:
    left
    right

prev = None
head = None

def treetoll(node):
    if node == None:
        return
    treetoll(node.left)
    if prev == None:
        head  = node
    else:
        prev.right = node
        node.left = prev
    prev = node
    treetoll(node.right)
    if prev.right == None:
        prev.right = head
        head.left = prev
