def longestcommonsubstr(A, B):
    i = 0
    j = 0
    longest = 0
    longtillnow = 0
    while i < len(A):
        for j in range(i+1,len(A)):
            if substrexists(B,A,i,j):
                if longtillnow < j-i+1:
                    longtillnow = j-i+1
            if longest < longtillnow:
                longest = longtillnow
        i+=1
    print longest

def substrexists(B, A, i, j):
    if len(B) < j-i+1:
        return False
    k=0
    found = True
    while k <= len(B)-j+i-1:
        for l in range(i,j+1):
            if B[k] != A[l]:
                found = False
                break
        if found:
            return True
        k+=1
    return found

A = ['a','b','c','d']
B = ['a','c','d','e']

longestcommonsubstr(A,B)
