import sys

def main():
    start_index = 0
    list = [5,3,6,1,2,7,8,4]
    end_index = len(list)-1
    array = quicksort(list, start_index, end_index)
    print array

def quicksort(array, start_index, end_index):
    if start_index < end_index:
        pivot_index = partition(array, start_index, end_index)
        quicksort(array, start_index, pivot_index - 1)
        quicksort(array, pivot_index + 1, end_index)
        return array
    
def partition(array, start_index, end_index):
    pivot = array[end_index]
    pivot_index = start_index
    
    for index in range(start_index,end_index):
        if array[index] <= pivot:
            temp = array[index]
            array[index] = array[pivot_index]
            array[pivot_index] = temp
            pivot_index = pivot_index + 1

    temp = pivot
    array[end_index] = array[pivot_index]
    array[pivot_index] = temp
    return pivot_index
            

if __name__ == '__main__':
    main()

