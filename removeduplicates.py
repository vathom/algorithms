def removeduplicates(array):
    if len(array) < 2:
        return
    i = 1
    j = 0
    while i < len(array):
        if array[i] == array[j]:
            i = i+1
        else:
            j = j+1
            array[j] = array[i]
            i = i+1
    return array[:j +1]



a = [1,1,1,1,3,3,3,4,5,6,6,6]
length = removeduplicates(a)
print length
            
