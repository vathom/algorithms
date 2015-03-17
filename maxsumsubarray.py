#kadane's algorithm to find maximum sum subarray

def max_sum_subarray(array):
    max_so_far = 0
    max_ending_here = 0
    for i in array:
        max_ending_here = max(0, max_ending_here + i)
        max_so_far = max(max_ending_here, max_so_far)

    return max_so_far


array = [1,-4,3,0,-5,2,-7,7,-5,4,-7,2,-7,6,-6,-5,-15]
max_sum = max_sum_subarray(array)
print max_sum
