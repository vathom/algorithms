def parseBashBraceExp(exp):
    if exp == "":
        return

class Stack:
    top = None

    def push(self, obj):
        if obj is None:
            return
        node = Node(obj)
        if top is None:
            top = node
        else:
            node.next = top
            top = node
            
    def pop(self):
        if top is None:
            return None
        node = top
        top = top.next
        return node

    def peek(self):
        if top is None:
            return None
        return top.data

class Node:
    data = None
    next = None
    
    def __init__(self, dataobj):
        if dataobj is None:
            
        data = dataobj


parseBashBraceExp("(a,b,cy)n,m")
