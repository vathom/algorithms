

def selectionsort(array, length):
    if length == 1:
        return array
    if length == 2:
        if array[0] > array[1]:
            array[0], array[1] = array[1], array[0]
            
    for i in range(0,length-1):
        imin = i
        for j in range(i+1, length):
            if array[imin] > array[j]:
                imin = j
        if imin != i:
            array[imin],array[i] = array[i],array[imin]

array = [3,2,5,4,6,7,8,9,1]
length = len(array)
selectionsort(array, length)
print array
           
