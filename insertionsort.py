
def insertionsort(array, length):
    for i in range(1,length):
        for j in reversed(range(i)):
            if array[j+1] > array[j]:
                break
            if array[j+1] < array[j]:
                array[j+1],array[j] = array[j],array[j+1]
    


array = [3,7,5,6,4,2,9,8,1]
length = len(array)
insertionsort(array, length)
print array
