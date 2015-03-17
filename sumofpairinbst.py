def class Node:
    left
    right
    value

dict = {}
def sumofpairinbst(Node node, sum):
    if node == null:
        return 0
    temp = sum - node.value
    if dict[temp] == 1:
        return True #temp, node.value is the answer
    else:
        dict[temp] = 1
    sumofpairinbst(node.left, sum)
    sumofpairinbst(node.right, sum)
