class Node:
    next = None
    val = 0

def sortll_quadratic(head):
    if head == None:
        return null
    newhead = None;
    first = head

    while first.next != None:
        second = first.next

        while second != None:
            if second.val < first.val:
                first.val = second.val + first.val
                second.val = first.val - second.val
                first.val = first.val - second.val
            second = second.next
            if newhead == None:
                newhead = first
        first = first.next
    return newhead

first = Node()
first.val = 5

second = Node()
second.val = 3

third = Node()
third.val = 2

fourth = Node()
fourth.val = 1
third.next = fourth
second.next = third
first.next = second

result = sortll(first)

print(result.val)
print(result.next.val)
print(result.next.next.val)
print(result.next.next.next.val)
