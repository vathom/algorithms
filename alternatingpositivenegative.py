# converts the array into alternating +ve and -ve numbers

def sortalternating(array):
    for i in range(0,len(array)-1):
        insert_index = i+1
        previous_state = ispositive(array[i])
        for j in range(i+1,len(array)):
            current_state = ispositive(array[j])
            if previous_state != current_state:
                if j == insert_index:
                    break
                else:
                    moveelementsbyone(array, insert_index, j)
                    break


def moveelementsbyone(array, start_index, end_index):
    last_value = array[end_index]
    for i in reversed(range(end_index, start_index)):
        if i == start_index:
            array[i] = last_value
        else:
            array[i] = array[i-1]
        

def ispositive(value):
    if value >= 0:
        return True
    return False

array = [2,-3,-3,9,-6,-7,8,-1,-1]
sortalternating(array)
print array
