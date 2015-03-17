def mergesort(A):
    length = len(A)
    if length <=1:
        return
    mid = length/2
    left = A[0:mid]
    right = A[mid:]
    mergesort(left)
    mergesort(right)
    merge(left, right, A)

def merge(left,right,A):
    i=j=k=0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            A[k] = left[i]
            i+=1
        else:
            A[k] = right[j]
            j+=1
        k+=1
    while i < len(left):
        A[k] = left[i]
        i+=1
        k+=1
    while j< len(right):
        A[k] = right[j]
        j+=1
        k+=1
            
            


arr = [5,2,3,4,6,1,7,2,9,8,0]
mergesort(arr)
print arr
