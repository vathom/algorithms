def longestpalindromesubstr(str):
    max_so_far = 0
    for i in range(0,len(str)-1):
        maximum = 0
        for j in range(i,len(str)):
            if ispalindrome(str, i, j):
                maximum = j-i+1
        max_so_far = max(max_so_far, maximum)
    return max_so_far

def ispalindrome(string, start, end):
    while start < end:
        if string[start] != string[end]:
           return False
        start+=1
        end-=1
    return True
    

def centeredlongestpalindrome(str):
    max_so_far = 0
    for i in range(0, len(str)):
        maximum = getpalindromecenteredaround(str, i, i)
        max_so_far = max(max_so_far, maximum)

        maximum = getpalindromecenteredaround(str, i, i+1)
        max_so_far = max(max_so_far, maximum)

    return max_so_far

def getpalindromecenteredaround(str, i, j):
    while i >=0 and j < len(str):
        if str[i] == str[j]:
            i-=1
            j+=1

    return j-i+1
    
def dplongestpalindrome():
    
str = 'amamamaia'
print longestpalindromesubstr(str)
print centeredlongestpalindrome(str)
    
